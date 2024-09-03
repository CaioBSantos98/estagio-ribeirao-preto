package com.ribeiraopreto.app.principal;

import com.ribeiraopreto.app.service.FibonacciService;

import java.util.Scanner;

public class Principal {
    private final Scanner scanner = new Scanner(System.in);
    private final FibonacciService fibonacciService = new FibonacciService();

    public void showMenu() {
        System.out.println("Informe um número para saber se ele pertence à sequência de Fibonacci");
        int number = scanner.nextInt();
        boolean exist = fibonacciService.existsOnFibonacciSequence(number);
    }
}
