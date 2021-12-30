package com.company;



import java.util.*;
import java.util.Scanner;
import java.util.Stack;

public class StackingReverse {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        Stack stk=new Stack();
        System.out.print("Enter the Phrase: ");
        String phrase=scn.nextLine().toLowerCase();
        char [] cPhrase=phrase.toCharArray();

        for (char i: cPhrase) {
        stk.push(i);
        }
        System.out.println(stk);
        for (char i: cPhrase) {
            stk.push(i);
        }
        while(!stk.empty()){
//            String[] values = stack.pop().trim().replaceAll(" ", "").split("/");
//            String[] moveList = values[0].trim().replaceAll(" ", "").split("-");
            System.out.print(stk.pop());
        }

    }

}
