package exercicio1.application;

import exercicio1.entities.Palavra;

import java.util.*;

///Crie um programa que solicite ao usuário uma lista de palavras.
// Armazene essas palavras em um Set para garantir que cada palavra
// apareça apenas uma vez. Em seguida, exiba a contagem de palavras únicas
// e liste as palavras em ordem alfabética.
public class Main {
    public static void main(String[] args) {
        final String PALAVRA_ENCERRAR = "fim";

        Scanner sc = new Scanner(System.in);

        Set<Palavra> colecaoPalavras = new HashSet<>();

        System.out.println("Digite as palavras! Para encerrar, digite " + PALAVRA_ENCERRAR + ".");

        int i = 1;
        while (true) {
            System.out.println("Digite a " + i + "° palavra: ");
            String palavra = sc.next();

            if (palavra.equalsIgnoreCase(PALAVRA_ENCERRAR)) {
                break;
            }

            colecaoPalavras.add(new Palavra(palavra.toLowerCase()));
            i++;
        }

        int tamanhoListaPalavras = colecaoPalavras.size();

        System.out.println("\nQuatidade de palavras unicas: " + tamanhoListaPalavras);


        List<Palavra> listaPalavras = new ArrayList<>(colecaoPalavras);

        Collections.sort(listaPalavras);

        System.out.println("Em ordem alfabetica: \n");
        for (Palavra palavra : listaPalavras) {
            System.out.println(palavra);
        }


    }
}