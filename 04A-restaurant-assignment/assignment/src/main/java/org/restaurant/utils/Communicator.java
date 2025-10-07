package org.restaurant.utils;
import java.util.Scanner;

public class Communicator {

    public boolean askYesNoQuestion(String prompt) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().trim().toLowerCase().contains("y");
    }

}
