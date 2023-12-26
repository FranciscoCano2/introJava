package LowDificult;

import java.util.Scanner;

public class UpperCase_LoweCase {
    public String UpperOrLower() {
        Scanner scanner = new Scanner(System.in);
        String word;
        int option;

        System.out.println("Enter a word");
        word = scanner.nextLine();

        while (true) {

            System.out.println("Choose a option: \n " +
                    "1- Capitalize \n " +
                    "2- Write in lowercase letters");
            option = scanner.nextInt();

            if (option == 1 || option == 2) {
                if (option == 1) {
                    return word.toUpperCase();

                }
                if (option == 2) {
                    return word.toLowerCase();
                }
            } else {
                System.out.println("The chosen option isn't available");
            }
        }
    }

}
