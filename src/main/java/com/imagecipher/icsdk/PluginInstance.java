package com.imagecipher.icsdk;

import java.util.LinkedList;
import java.util.List;

public class PluginInstance {

    private String pluginName;
    private String pluginVersion;
    private List<IcEncrypter> encrypters = new LinkedList<>();

    public String getPluginName() {
        return pluginName;
    }

    public void setPluginName(String pluginName) {
        this.pluginName = pluginName;
    }

    public String getPluginVersion() {
        return pluginVersion;
    }

    public void setPluginVersion(String pluginVersion) {
        this.pluginVersion = pluginVersion;
    }

    public List<IcEncrypter> getEncrypters() {
        return encrypters;
    }

    public void setEncrypters(List<IcEncrypter> encrypters) {
        this.encrypters = encrypters;
    }
}
