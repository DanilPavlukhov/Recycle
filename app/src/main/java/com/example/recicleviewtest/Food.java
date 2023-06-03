package com.example.recicleviewtest;

public class Food {
    private String codeName;
    private String codeVersion;
    //private int int_Image;

    public Food(String codeName, String codeVersion /*, int int_Image*/) {
        this.codeName = codeName;
        this.codeVersion = codeVersion;
        //this.int_Image = int_Image;
    }

    public void setCodeName(String codeName) {
        this.codeName = codeName;
    }

    public void setCodeVersion(String codeVersion) {
        this.codeVersion = codeVersion;
    }

    /*public void setInt_Image(int int_Image) {
        this.int_Image = int_Image;
    }*/

    public String getCodeName() {
        return codeName;
    }

    public String getCodeVersion() {
        return codeVersion;
    }

    /*public int getInt_Image() {
        return int_Image;
    }*/
}
