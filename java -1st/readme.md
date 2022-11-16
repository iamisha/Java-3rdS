# 1. ArithmeticException and InputMismatchException handling

---> ArithmeticException and InputMismatchExcetpion are the types of Unchecked/RunTimeException.

---> The RunTimeException are not checked by the compiler, but directly taken care by JVM.

---> UncheckedException are rarely occured exception so, the compiler doesn't take care very much about these exception.

---> Example program:-

import java.util.Scanner;

class Division {
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
