package com.company;
import java.io.*;
import java.util.*;
public class HackerPalindrome {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            char[] a =A.toCharArray();
            char ca[] = new char[A.length()];
            Stack<Character> stk= new Stack<>();

            /* Enter your code here. Print output to STDOUT. */
            for(char s :a){
                stk.push(s);
            }
            for(int i=0;i<A.length();i++){
                ca[i]=stk.pop();
            }
            String B= String.valueOf(ca);
            if (A.equals(B)){//A.compareTo(B)==0
                System.out.println("yes");
            }else{
                System.out.println("No");
            }

        }
    }





