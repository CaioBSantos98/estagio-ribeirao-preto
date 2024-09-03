package com.ribeiraopreto.app.principal;

import com.ribeiraopreto.app.service.ChallengeCodeSnippetService;
import com.ribeiraopreto.app.service.FibonacciService;
import com.ribeiraopreto.app.service.StringService;

import java.util.Scanner;

public class Principal {
    private final Scanner scanner = new Scanner(System.in);
    private final FibonacciService fibonacciService = new FibonacciService();
    private final StringService stringService = new StringService();
    private final ChallengeCodeSnippetService codeSnippetService = new ChallengeCodeSnippetService();

    public void showMenu() {
        System.out.println("\n##### BOAS VINDAS AO CONSOLE DO TESTE PRATICO ESTAGIO - RIBEIRAO PRETO #####");
        try {
            int chosenItem = 0;
            while (chosenItem != 5) {
                showMenuItens();
                String typedText = scanner.nextLine();
                chosenItem = Integer.parseInt(typedText);

                switch (chosenItem) {
                    case 1 -> fibonacciService.verify();
                    case 2 -> stringService.verifyHasCharacterA();
                    case 3 -> codeSnippetService.verifyCodeProvided();
                    case 5 -> System.out.println("Saindo...");
                    default -> {
                        System.out.println("Opção selecionada inválida, tente novamente");
                        chosenItem = 0;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showMenuItens() {
        System.out.println("\nDIGITE O NÚMERO DA OPERAÇÃO DESEJADA:");
        System.out.println("1 -> Verificar se número digitado pertence à sequência de Fibonacci");
        System.out.println("2 -> Verificar se string digitada contem a letra 'a'");
        System.out.println("3 -> Verificar trecho de codigo do desafio");
        System.out.println("5 -> Sair");
    }
}
