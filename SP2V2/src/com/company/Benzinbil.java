package com.company;

public class Benzinbil extends Bil {
    int Oktantal;
    int kmPrL;  //kilometer pr litter

    public Benzinbil(int RegNr, String Mærke, String Model, int Årgang, int AntalDøre, int Oktantal, int kmPrL) {
        super(RegNr, Mærke,Model, Årgang, AntalDøre);
        this.Oktantal=Oktantal;
        this.kmPrL=kmPrL;
    }

    @Override
    public String toString() {
        return "Benzinbil{" +
                "regNr=" + RegNr +
                ", Mærke='" + Mærke + '\'' +
                ", Årgang=" + Årgang +
                ", AntalDøre=" + AntalDøre +
                ", Oktantal=" + Oktantal +
                ", kmPrL=" + kmPrL+
                '}';
    }

    public int getOktantal() {
        return Oktantal;
    }

    public void setOktantal(int oktantal) {
        Oktantal = oktantal;
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
            Grønafgift=330;
        }
        else if (kmPrL>= 15 && kmPrL<=20){
            Grønafgift=1050;
        }
        else if (kmPrL>=10 && kmPrL<=15){
            Grønafgift = 2340;
        }
        else  if (kmPrL>=5 && kmPrL<=10)   {
            Grønafgift= 5500;
        }
        else if (kmPrL>0 && kmPrL<=5)   {
            Grønafgift = 10470;
        }

        return Grønafgift;
    }
}
