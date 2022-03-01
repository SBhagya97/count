
import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int num=0;
        int total=0;
        for (int i=1;i<4;i++){
            System.out.println("Enter mark"+i+": ");
            num=input.nextInt();

            total=total+num;
            int avg=total/4;

            if (num>75){
                System.out.println("A");
            }
            else if (num>65){
                System.out.println("A");
            }
            else if (num>50){
                System.out.println("A");
            }
            else
            {
                System.out.println("E");
            }
        }
        System.out.println(total);
        System.out.println(total/4);
    }
}
