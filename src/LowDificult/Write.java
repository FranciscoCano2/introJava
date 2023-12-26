package LowDificult;

import java.util.Scanner;

public class Write {
    public String writeName() {
        Scanner scanner = new Scanner(System.in);
        String name, surname;

        System.out.println("Write your name");
        name = scanner.nextLine();

        System.out.println("Write your surname");
        surname = scanner.nextLine();

        return name + " " + surname;
    }
}
