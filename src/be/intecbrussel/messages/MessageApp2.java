package be.intecbrussel.messages;

import java.util.Scanner;

public class MessageApp2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userInput;
        do {
            userInput = scanner.nextLine();
            Message message = Message.valueOf(userInput.toUpperCase());
            System.out.println(message);
        } while (!userInput.equalsIgnoreCase("exit"));


    }
}
