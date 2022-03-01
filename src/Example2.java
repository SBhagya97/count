import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter anything:");
        String anything= input.next();

        switch (anything){
            case "A":
                System.out.println("Apple");
                break;
            case "B":
                System.out.println("Ball");
                break;
            case "C":
                System.out.println("CAT");
                break;
            case "D":
                System.out.println("Doll");
                break;
            default:
                System.out.println("invalid");

        }
    }
}
