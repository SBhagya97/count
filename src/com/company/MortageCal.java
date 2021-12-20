package com.company;
import java.util.*;
import java.util.Scanner;
public class MortageCal {
    public static double npv;
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        System.out.print("principle: ");
        double principle=scn.nextFloat();
        System.out.print("Annual Interest Rate: ");
        double rate=scn.nextFloat();
        System.out.print("Period (years): ");
        double period=scn.nextFloat();


        double r =interestRate(rate);
        System.out.println(r);
        presentValue(period,r);
       valueDown(npv);

    }

    public static double presentValue(double period, double r) {
        double pv=1+r;
        int netPeriod= (int) (period*12);
        npv=Math.pow(pv,netPeriod);
        double netValueUp=r*npv;
        return netValueUp;


    }

    public static double interestRate(double rate) {
        double mRate=rate/100/12;
        return mRate;

    }
   public static double valueDown(double npv){

        double downValue=npv-1;
        return downValue;
    }


}
