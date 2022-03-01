package com.company;

public class Test {
    public static void main (String [] args) {
        String[] arr = {"P@sswORD1","asadsds","PASS6word"};
        check(arr,"4dro6");

    }

    public static void check(String[] arr,String password){
        String ans = "";
        for(String pass: arr){
            int upper = 0;
            String last = "";
            String end = "";

            int sum = 0;
            for (int i = 0; i < pass.length(); i++) {
                char temp = pass.charAt(i);
                if (temp >= 'A' && temp <= 'Z'){
                    upper++;
                }
                if(i>=pass.length()-3){
                    last = last + pass.charAt(i);
                }
                if(temp>='0' && temp<='9'){
                    sum = Integer.parseInt((String.valueOf(temp))) + sum;
                }

            }
            String lastrev = "";
            for (int i = last.length()-1; i >= 0; i--) {
                lastrev = lastrev + last.charAt(i);
            }
            end = upper + lastrev + sum;
            if(password.equals(end)){
                ans = pass;
                break;
            }

        }
        System.out.println(ans);
    }
}