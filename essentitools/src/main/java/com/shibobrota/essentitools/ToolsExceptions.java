package com.shibobrota.essentitools;

final class ToolsExceptions extends Exception {

    static final String ApplicationContectNotFound = "Application context not found. Please pass Application context";

    public ToolsExceptions(String exceptionDetails) {
        super(exceptionDetails);
    }
}
