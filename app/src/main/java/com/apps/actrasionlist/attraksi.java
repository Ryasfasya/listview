package com.apps.actrasionlist;

public class attraksi {
    int image;
    String placename;
    String artikel;

    public attraksi(int image, String placename, String artikel) {
        this.image = image;
        this.placename = placename;
        this.artikel = artikel;
    }

    public attraksi() {

    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getPlacename() {
        return placename;
    }

    public void setPlacename(String placename) {
        this.placename = placename;
    }

    public String getArtikel() {
        return artikel;
    }

    public void setArtikel(String artikel) {
        this.artikel = artikel;
    }


}
