package com.imagecipher.icsdk;

public interface IcPlugin {

    PluginInstance onPluginLoaded();
    void onPluginShutdown();
}
