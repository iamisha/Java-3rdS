package practise;
import java.util.InputMismatchException;
import java.util.Scanner;

class DivisionExam{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        try{

            System.out.println("Enter the first integer:- ");
            int num1 = sc.nextInt();
            System.out.println("Enter the second integer:- ");
            int num2 = sc.nextInt();
            int res = num1/num2;
            System.out.println("The division is:- "+res);
        }catch(ArithmeticException e){
            System.out.println("it's infinite value hehe");
        }catch(InputMismatchException e){
            System.out.println("please inter only integer value");
        }
    }
}