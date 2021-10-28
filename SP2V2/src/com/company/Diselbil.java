package com.company;

public class Diselbil extends Bil {
    boolean harPartikelfilter;
    int kmPrL; // kilometer pr litter


    public Diselbil(int Regnr, String Mærke, String Model, int Årgang, int AntalDøre, boolean harPartikelfilter, int kmPrL) {
        super(Regnr, Mærke, Model, Årgang, AntalDøre);
        this.kmPrL = kmPrL;
        this.harPartikelfilter = harPartikelfilter;
    }

    @Override
    public String toString() {
        return "Diselbil{" +
                "regNr=" + RegNr +
                ", Mærke='" + Mærke + '\'' +
                ", Årgang=" + Årgang +
                ", AntalDøre=" + AntalDøre +
                ", harPartikelfilter=" + harPartikelfilter +
                ", kmPrl=" + kmPrL +
                '}';
    }

    @Override
    public int getRegNr() {
        return super.getRegNr();
    }

    @Override
    public String getMærke() {
        return super.getMærke();
    }

    @Override
    public int getÅrgang() {
        return super.getÅrgang();
    }

    @Override
    public int getAntalDøre() {
        return super.getAntalDøre();
    }


    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }


    @Override
    public double beregnGrønEjerafgift() {
        double Grønafgift= 0;

        if (kmPrL>= 20 && kmPrL<=50){
            Grønafgift=330+130;
        }
        else if (kmPrL>= 15 && kmPrL<=20){
            Grønafgift=1050+1390;
        }
        else if (kmPrL>=10 && kmPrL<=15) {
            Grønafgift = 2340+1850;
        }
        else  if (kmPrL>=5 && kmPrL<=10)   {
            Grønafgift= 5500+2770;
        }
        else if (kmPrL>=0 && kmPrL<=5)   {
            Grønafgift = 10470+15260;
        }
        if (harPartikelfilter=false){
            Grønafgift=Grønafgift+1000;
        }
        return Grønafgift;
    }
}



