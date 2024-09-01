package exercicio6.application;

//Crie uma classe Produto com os atributos id, nome, e preco.
// Implemente a sobrescrita dos métodos equals e hashCode de
// maneira adequada, de modo que dois objetos Produto sejam
// considerados iguais se tiverem o mesmo id. Em seguida, crie
// um Set de Produto e adicione vários objetos a ele, incluindo
// alguns com IDs repetidos. Verifique se o Set mantém apenas produtos
// únicos, ou seja, aqueles com IDs distintos.

import exercicio6.entities.Produto;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Produto> produtos = new HashSet<>();

        produtos.add(new Produto(1L, "Produto 1", 10.0));
        produtos.add(new Produto(2L, "Produto 2", 20.0));
        produtos.add(new Produto(3L, "Produto 3", 30.0));
        produtos.add(new Produto(1L, "Produto 4", 40.0)); // id repetido
        produtos.add(new Produto(5L, "Produto 5", 50.0));
        produtos.add(new Produto(6L, "Produto 6", 60.0));
        produtos.add(new Produto(2L, "Produto 7", 70.0)); // id repetido
        produtos.add(new Produto(8L, "Produto 8", 80.0));
        produtos.add(new Produto(9L, "Produto 9", 90.0));
        produtos.add(new Produto(10L, "Produto 10", 100.0));

        for(Produto produto : produtos){
            System.out.println(produto);
        }


    }
}
