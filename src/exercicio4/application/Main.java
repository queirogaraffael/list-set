package exercicio4.application;

//Crie um programa que solicite ao usuário que insira uma lista de nomes.
// Armazene esses nomes em uma List e ordene-os em ordem alfabética. Depois,
// converta a List para um Set para remover possíveis duplicatas e exiba o
// conjunto de nomes ordenados.

import exercicio4.entities.Nome;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        final String PALAVRA_ENCERRAR = "fim";

        Scanner sc = new Scanner(System.in);

        List<Nome> listaNomes = new ArrayList<>();

        System.out.println("Digite os nomes! Para encerrar, digite " + PALAVRA_ENCERRAR + ".");

        int i = 1;
        while (true) {
            System.out.println("Digite a " + i + "° nome: ");
            String nome = sc.next();

            if (nome.equalsIgnoreCase(PALAVRA_ENCERRAR)) {
                break;
            }

            listaNomes.add(new Nome(nome.toLowerCase()));
            i++;
        }

        // Ordena os nomes em ordem alfabetica.
        //Collections.sort(listaNomes);
        // Nesse caso achei redundante colocar, pois o proximo
        // codigo ja Ordena

        // Remove as duplicatas
        Set<Nome> colecaoNomes = new TreeSet<>(listaNomes);

        System.out.println("Conjunto de nomes ordenados: ");
        for(Nome nome : colecaoNomes){
            System.out.println(nome);
        }

    }
}
