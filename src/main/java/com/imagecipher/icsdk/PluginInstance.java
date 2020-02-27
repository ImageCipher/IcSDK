package com.imagecipher.icsdk;

import java.util.LinkedList;
import java.util.List;

public class PluginInstance {

    private List<IcEncrypter> encrypters = new LinkedList<>();

    public List<IcEncrypter> getEncrypters() {
        return encrypters;
    }

    public void setEncrypters(List<IcEncrypter> encrypters) {
        this.encrypters = encrypters;
    }
}
