package exercicio4.entities;

import java.util.Objects;

public class Nome implements Comparable<Nome>{
    private String nome;

    public Nome() {
    }

    public Nome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Nome nome1 = (Nome) o;
        return Objects.equals(nome, nome1.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(nome);
    }

    @Override
    public String toString() {
        return nome;
    }

    @Override
    public int compareTo(Nome o) {
        return this.nome.compareTo(o.nome);
    }
}
