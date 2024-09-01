package exercicio3;

//Crie um programa que receba uma lista de números inteiros do usuário.
// Utilize um Set para remover os números duplicados da lista e, em seguida,
// exiba a lista original e a lista sem duplicatas.

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> listaNumerosInteiros = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            try {
                System.out.println("Digite o " + i + "° numero inteiro: ");
                Integer numeroInteiro = sc.nextInt();

                listaNumerosInteiros.add(numeroInteiro);
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida! Digite um numero inteiro.");
                sc.next();
                i--;
            }

        }

        // remove as duplicatas automaticamente
        Set<Integer> colecaoNumerosInteiros = new HashSet<>(listaNumerosInteiros);


        System.out.println("Lista original: ");
        for (Integer numero: listaNumerosInteiros){
            System.out.println(numero);
        }

        System.out.println("\nLista sem duplicatas: ");
        for (Integer numero: colecaoNumerosInteiros){
            System.out.println(numero);
        }



        sc.close();
    }
}
