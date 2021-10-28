package com.company;

public abstract class Bil {
    int RegNr;
    String Mærke;
    String Model;
    int Årgang;
    int AntalDøre;



    public Bil(int RegNr, String Mærke, String Model, int Årgang, int AntalDøre){
        this.RegNr=RegNr;
        this.Mærke=Mærke;
        this.Model=Model;
        this.Årgang=Årgang;
        this.AntalDøre=AntalDøre;
    }

    public abstract double beregnGrønEjerafgift();

    public int getRegNr() {
        return RegNr;
    }

    public void setRegNr(int regNr) {
        RegNr = regNr;
    }

    public String getMærke() {
        return Mærke;
    }

    public void setMærke(String mærke) {
        Mærke = mærke;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public int getÅrgang() {
        return Årgang;
    }

    public void setÅrgang(int årgang) {
        Årgang = årgang;
    }

    public int getAntalDøre() {
        return AntalDøre;
    }

    public void setAntalDøre(int antalDøre) {
        AntalDøre = antalDøre;
    }

}
