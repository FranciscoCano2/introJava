import LowDificult.Calculator;
import LowDificult.UpperCase_LoweCase;
import LowDificult.Write;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Write write = new Write();
        UpperCase_LoweCase upperAndLower = new UpperCase_LoweCase();

        System.out.println("Enter the program number to run \n " +
                "1- Add \n " +
                "2- Write your Name \n " +
                "3- UpperCase and LowerCase\n " +
                "4- \n " +
                "5- \n ");


        int option = read.nextInt();
        switch (option) {
            case 1:
                int add = calculator.addPlus();
                System.out.println(add);
                break;

            case 2:
                String completeName = write.writeName();
                System.out.println(completeName);
                break;

            case 3:
                String word = upperAndLower.UpperOrLower();
                System.out.println(word);
                break;

            case 4:
                break;

            case 5:
                break;

        }



    }
}