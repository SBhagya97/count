package com.company;

public class StarPatterns {
    public static void main(String[] args) {
        int x= 5;
        /*

        *  *
        *  **
        *  ***
        *  ****
        *  *****
        *
        * */
        
        for(int i = 0; i<=5; i++){

            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }



        /*

         *  *
         *  **
         *  ***
         *  ****
         *  *****
         *
         * */

        for(int i = 0; i<=5; i++){

            for(int j=2*(5-i);j>=5;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
