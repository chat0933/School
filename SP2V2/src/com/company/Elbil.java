package com.company;

public class Elbil extends  Bil{
    int batterikapacitetKWh;
    int maxKm;
    int whPrKm;

    public Elbil(int Regnr, String Mærke, String Model, int Årgang, int AntalDøre, int batterikapacitetKWh, int maxKm, int whPrKm) {
        super(Regnr, Mærke, Model, Årgang, AntalDøre);
        this.batterikapacitetKWh=batterikapacitetKWh;
        this.maxKm=maxKm;
        this.whPrKm=whPrKm;
    }

    @Override
    public String toString() {
        return "Benzinbil{" +
                "regNr=" + RegNr +
                ", Mærke='" + Mærke + '\'' +
                ", Årgang=" + Årgang +
                ", AntalDøre=" + AntalDøre +
                ", batterikapacitetKWh" + batterikapacitetKWh+
                ", maxKm" + maxKm +
                ", whPrKm" + whPrKm+
                '}';
    }

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public double beregnGrønEjerafgift() {
        double Grønafgift= 0;
        // FOR AT OMREGNE whPrKm til kmPrl bruges formlen 100/(whPrKm/91,25)
        // fx Den første mellem 20-50 er derfor = 100(20/91,25) og 100(50/91,25) osv.
        // først udregn paraentesen og derefter divider 100 med det tal man får

        // mellem 20 og 50 = 330 kr
        if (whPrKm>= 455.16 && whPrKm<=182.51){
            Grønafgift = 330;
        }
        //mellem 15 og 20 = 1050 kr
        else if (whPrKm>=609.75 && whPrKm <= 466.15) {
            Grønafgift = 1050;
        }

        //mellem 10 og 15= 2340 kr
        else if (whPrKm>=917.43 && whPrKm<=609.75)   {
            Grønafgift = 2340;
        }

        //mellem 5 og 10 = 5500 kr
        else if (whPrKm>=1851.85 && whPrKm<= 916.43){
            Grønafgift=5500;
        }

       // under 5 = 10470 kr
        // har brugt 1 i dette tilfælde
        else if (whPrKm>=9171.31 && whPrKm<=1851.85){
            Grønafgift=104670;
        }

        return Grønafgift;
    }
}
