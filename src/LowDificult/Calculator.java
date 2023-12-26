package LowDificult;

import java.util.Scanner;

public class Calculator {
    public static int addPlus(){
        Scanner read = new Scanner(System.in);
        int num1, num2, result;

        System.out.println("Write the first number:");
        num1 = read.nextInt();

        System.out.println("Write the second number:");
        num2 = read.nextInt();

        return num1+num2;

    }
}
