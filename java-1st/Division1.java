
import java.util.Scanner;

class Division1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first integer value:-");
        int a = sc.nextInt();
        System.out.println("Enter the second integer value:-");
        int b = sc.nextInt();
        try {
            int ans = a / b;
            System.out.println("Your answer is " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Please enter the valid integers.");
        }

    }
}