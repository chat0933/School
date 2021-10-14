package com.company;

public class runController {

    public static void Controller() {
       String MSG = "MOMS";
        double userIn = doDiag();
        double moms = doVAT(userIn);
        doView(moms, MSG);
    }
}
