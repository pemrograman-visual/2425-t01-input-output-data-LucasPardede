// 12S24022 - INGRATE JOY SIHOMBING
// 12S24015 - LUCAS PARDEDE

import java.util.*;
import java.lang.Math;

public class T01 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String iSBN;
        String jUDUL;
        String pENULIS;
        int tAHUNTERBIT;
        String pENERBIT;
        String fORMATBUKU;
        double hARGAPEMBELIAN;
        double mINIMUMMARGIN;
        int sTOK;
        double rATING;

        iSBN = input.nextLine();
        jUDUL = input.nextLine();
        pENULIS = input.nextLine();
        tAHUNTERBIT = Integer.parseInt(input.nextLine());
        pENERBIT = input.nextLine();
        fORMATBUKU = input.nextLine();
        hARGAPEMBELIAN = Double.parseDouble(input.nextLine());
        mINIMUMMARGIN = Double.parseDouble(input.nextLine());
        sTOK = Integer.parseInt(input.nextLine());
        rATING = Double.parseDouble(input.nextLine());
        System.out.println(iSBN + "|" + jUDUL + "|" + pENULIS + "|" + tAHUNTERBIT + "|" + pENERBIT + "|" + fORMATBUKU + "|" + hARGAPEMBELIAN + "|" + mINIMUMMARGIN + "|" + sTOK + "|" + rATING);
    }
}
