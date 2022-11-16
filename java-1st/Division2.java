
import java.util.InputMismatchException;
import java.util.Scanner;

class Division2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the first integer value:-");
            int a = sc.nextInt();
            System.out.println("Enter the second integer value:-");
            int b = sc.nextInt();
            int ans = a / b;
            System.out.println("Your answer is " + ans);
        } catch (ArithmeticException e) {
            System.out.println("Please enter the valid integers.");
        } catch (InputMismatchException e) {
            System.out.println("you are restricted to take string as input");
        }
    }
}