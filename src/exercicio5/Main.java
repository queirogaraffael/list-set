package exercicio5;

//Implemente um programa que solicite ao usuário duas listas de números
// inteiros. Em seguida, converta essas listas em conjuntos (Set) e
// exiba a união e a interseção desses conjuntos.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> lista1 = new ArrayList<>();
        List<Integer> lista2 = new ArrayList<>();

        System.out.println("Digite 5 numeros inteiros em cada lista.\n");

        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("Digite o " + i + "° numero inteiro da primeira lista: ");
                Integer numeroInteiro = sc.nextInt();

                lista1.add(numeroInteiro);
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida! Digite um numero inteiro.");
                sc.next();
                i--;
            }

        }

        System.out.println();

        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("Digite o " + i + "° numero inteiro da segunda lista: ");
                Integer numeroInteiro = sc.nextInt();

                lista2.add(numeroInteiro);
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida! Digite um numero inteiro.");
                sc.next();
                i--;
            }

        }

        // converte para set
        Set<Integer> colecao1 = new HashSet<>(lista1);
        Set<Integer> colecao2 = new HashSet<>(lista2);

        Set<Integer> uniao = new HashSet<>(colecao1);
        uniao.addAll(colecao2);

        Set<Integer> intersecao = new HashSet<>(colecao1);
        intersecao.retainAll(colecao2);

        System.out.println("Uniao: ");
        for (Integer numero : uniao) {
            System.out.println(numero);
        }

        System.out.println("Intersecao: ");
        for (Integer numero : intersecao) {
            System.out.println(numero);
        }

    }
}
