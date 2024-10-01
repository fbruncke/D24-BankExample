package org.example;

import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //BankAccount bc = new BankAccount();

        //user input
        String inputSender = "Bo";
        String inputRecipient = "Karla";

        Letter letter = new Letter(inputRecipient,inputSender);

        System.out.println("Letter information sender: " + letter.getSender() +
                ", reciepient: " + letter.getRecipient() );

        Letter letter2 = new Letter("Bibi",inputSender);
    }
}