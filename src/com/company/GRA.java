package com.company;

import com.sun.org.apache.bcel.internal.generic.ARETURN;

public class GRA {
    public static void main(String[] args) {
        int [] arr={21,28,32,77,10};

        for (int i : arr){
            if (i %7==0 && i==77){
                System.out.println(0);
            }
            else if(i %7==0){
                System.out.println(i);
            }
        }
    }
}
