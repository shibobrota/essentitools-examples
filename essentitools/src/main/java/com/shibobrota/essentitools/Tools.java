package com.shibobrota.essentitools;

import android.app.Application;
import android.content.Context;

public class Tools {

    public static String getPackageName(Context context) throws ToolsExceptions {
        if (context instanceof Application) {
            return context.getPackageName();
        } else {
            throw new ToolsExceptions(ToolsExceptions.ApplicationContectNotFound);
        }
    }
}
