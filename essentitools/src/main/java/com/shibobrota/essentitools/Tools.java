package com.shibobrota.essentitools;

import android.app.Application;
import android.content.Context;

import java.io.BufferedReader;
import java.io.InputStreamReader;

final public class Tools {

    builder builder;

    public static String getPackageName(Context context) throws ToolsExceptions {
        if (context instanceof Application) {
            return context.getPackageName();
        } else {
            throw new ToolsExceptions(ToolsExceptions.ApplicationContectNotFound);
        }
    }

    public static String getPath(Context context) throws ToolsExceptions {
        if (context instanceof Application) {
            return context.getFilesDir().getAbsolutePath();
        } else {
            throw new ToolsExceptions(ToolsExceptions.ApplicationContectNotFound);
        }
    }

    public static final class builder {

        private String packageName;
        private String configFilePath;
        private Context context;

        public builder(Context context) throws ToolsExceptions {
            this.packageName = getPackageName(context);
            this.configFilePath = getPath(context);
            this.context = context;
        }

        public builder build() {
            return this;
        }

        public String getFileString() throws Exception {
            BufferedReader reader;
            StringBuilder file = new StringBuilder();
            reader = new BufferedReader(new InputStreamReader(context.getAssets().open("tools-settings.json")));
            String line;
            while ((line = reader.readLine()) != null) {
                file.append(line);
            }
            reader.close();
            return file.toString();
        }
    }
}
