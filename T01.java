// 12S24022 - INGRATE JOY SIHOMBING
// 12S24015 - LUCAS PARDEDE


import java.util.*;
import java.lang.Math;

public class Program {
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
        tAHUNTERBIT = input.nextInt();
        pENERBIT = input.nextLine();
        fORMATBUKU = input.nextLine();
        hARGAPEMBELIAN = input.nextDouble();
        mINIMUMMARGIN = input.nextDouble();
        sTOK = input.nextInt();
        rATING = input.nextDouble();
        System.out.println(iSBN + "|" + jUDUL + "|" + pENULIS + "|" + tAHUNTERBIT + "|" + pENERBIT + "|" + fORMATBUKU + "|" + hARGAPEMBELIAN + "|" + mINIMUMMARGIN + "|" + sTOK + "|" + rATING);
    }
}
