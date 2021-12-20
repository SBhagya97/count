package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name= "Digiratina";
        char[] cA=name.toCharArray();
        char ch= name.toCharArray()[1];
        int count=0;
        int jCount=0;
        System.out.println(name.length());
        for(char i: cA){
            try {
                if(ch==i){
                    count++;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

        }
        System.out.println("Occurance of \"i\" of Digiratina are"+" "+ count);
        for (int j=0; j<name.length();j++){
            if(ch==cA[j]){
                jCount++;
            }
        }
        System.out.println("jCount"+" "+jCount);
    }
}
