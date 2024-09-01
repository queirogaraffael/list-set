package exercicio2;

// Escreva um programa que solicite ao usuário dois conjuntos (Set) de
// números inteiros. Verifique se o segundo conjunto é um
// subconjunto do primeiro, ou seja, se todos os elementos do segundo
// conjunto estão presentes no primeiro. Exiba uma mensagem indicando o
// resultado da verificação.

import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();

        System.out.println("Digite 5 numeros inteiros em cada conjunto.\n");

        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("Digite o " + i + "° numero inteiro do primeiro conjunto: ");
                Integer numeroInteiro = sc.nextInt();

                conjunto1.add(numeroInteiro);
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida! Digite um numero inteiro.");
                sc.next();
                i--;
            }

        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("Digite o " + i + "° numero inteiro do segundo conjunto: ");
                Integer numeroInteiro = sc.nextInt();

                conjunto2.add(numeroInteiro);
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida! Digite um numero inteiro.");
                sc.next();
                i--;
            }

        }

        boolean isSubconjunto = conjunto1.containsAll(conjunto2);

        System.out.println();

        if (isSubconjunto) {
            System.out.println("O Conjunto 2 e subconjunto do Conjunto 1.");
        } else {
            System.out.println("O Conjunto 2 nao e subconjunto do Conjunto 1.");

        }


        sc.close();
    }
}
