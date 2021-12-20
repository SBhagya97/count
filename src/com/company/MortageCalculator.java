package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortageCalculator {
    public static void main(String[] args) {

        final byte months=12;
        final byte percent=100;
        int principle=0;
        float annualRate=0;
        float monthlyIRate=0;
        int years=0;

        Scanner scn=new Scanner(System.in);
        while (true) {
            System.out.print("principle ($1k-$1M): ");
            principle=scn.nextInt();
            if (principle>=1000 && principle<=1000000){
                break;
            }
            else{
                System.out.println("Enter the Number more than 1k or less than 1M");
            }
        }
        while(true) {
            System.out.print("Annual Interest Rate(0-30): ");
            annualRate=scn.nextFloat();
            if(annualRate>0 && annualRate<30) {
                monthlyIRate = annualRate / percent / months;
                break;
            }
            else{
                System.out.println("Enter the rate greater than 0 or less than 30");
            }
        }

        System.out.print("Period (years): ");
        years=scn.nextInt();
        int period=years*months;


        double mortage=principle*monthlyIRate*Math.pow(1+monthlyIRate,period)/(Math.pow(1+monthlyIRate,period)-1);
        NumberFormat curr= NumberFormat.getCurrencyInstance();
        String rst=curr.format(mortage);
        System.out.println(rst);

    }
}
