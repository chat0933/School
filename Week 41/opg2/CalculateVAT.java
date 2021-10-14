package com.company;

public class CalculateVAT {
    public static double doVAT(double number) {
        double VAT = number / 100 * PRCVAT;
        return VAT;
    }
}
