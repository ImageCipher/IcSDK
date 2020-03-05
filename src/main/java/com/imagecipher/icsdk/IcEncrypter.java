package com.imagecipher.icsdk;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public abstract class IcEncrypter implements AutoCloseable {

    protected String fileName;
    protected BufferedImage image;

    public IcEncrypter() {
    }

    public abstract void encrypt(String text);

    public String getFileName() {
        return fileName;
    }

    public void setSourceFile(String fileName) throws IOException {
        this.fileName = fileName;
        this.image = ImageIO.read(new File(fileName));
    }

    public BufferedImage getImage() {
        return image;
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }
}
