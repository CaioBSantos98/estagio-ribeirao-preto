package com.ribeiraopreto.app.service;

public class ChallengeCodeSnippetService {

    public void verifyCodeProvided() {
        int index = 12;
        var sum = 0;
        int k = 1;

        while (k < index) {
            k = k + 1;
            sum = sum + k;
        }
        System.out.println("O valor da variavel SOMA é: " + sum);
    }
}
