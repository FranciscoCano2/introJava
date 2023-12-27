import LowDificult.*;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Write write = new Write();
        CelsiusToFahrenheit converter = new CelsiusToFahrenheit();
        UpperCase_LoweCase upperAndLower = new UpperCase_LoweCase();
        Operations operations = new Operations();

        System.out.println("Enter the program number to run \n " +
                "1- Add \n " +
                "2- Write your Name \n " +
                "3- UpperCase and LowerCase\n " +
                "4- Celsius to Fahrenheit\n " +
                "5- Operations\n ");


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
                float fahrenheit = converter.temperatureConverter();
                System.out.println("Temperature: "+ fahrenheit + "ºF");
                break;

            case 5:
                System.out.println("Enter a number for the operations:");
                int number = read.nextInt();

                System.out.println("The number is: "+number+" and his double is: "+ operations.doubles(number));
                System.out.println("The number is: "+number+" and his triple is: "+ operations.triple(number));
                System.out.println("The number is: "+number+" and his square root is: "+ operations.squareRoot(number));
                break;

        }



    }
}