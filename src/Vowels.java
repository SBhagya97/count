import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner scn =new Scanner(System.in);
        System.out.print("Enter the String:");
        String word=scn.nextLine().toLowerCase();
        char ch[]=word.toCharArray();
        int count=0;
        for (int i:ch) {
            if(i=='a'||i=='e'||i=='i'||i=='o'||i=='u'){
                //System.out.println("letter "+word.indexOf(i)+ " is vowel");
                count ++;
            }
        }
        System.out.println("there are "+count +" number of vowels");
    }
}
