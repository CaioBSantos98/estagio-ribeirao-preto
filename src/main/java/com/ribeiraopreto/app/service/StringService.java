package com.ribeiraopreto.app.service;

import java.util.Scanner;

public class StringService {

    private final Scanner scanner = new Scanner(System.in);

    public void verifyHasCharacterA() {
        System.out.println("Informe uma string para verificar se ela possui a letra 'a'");
        String typedString = scanner.nextLine();
        boolean containsA = typedString.toLowerCase().contains("a");
        if (containsA) {
            int occurrences = 0;
            for (int i = 0; i < typedString.length(); i++) {
                var character = typedString.charAt(i);
                if (character == 'a') {
                    occurrences++;
                }
            }
            System.out.println("A string digitada possui a letra 'a'");
            System.out.println("A letra 'a' ocorreu " + occurrences + " vezes");
        } else {
            System.out.println("A string digitada não possui a letra 'a'");
        }
    }
}
