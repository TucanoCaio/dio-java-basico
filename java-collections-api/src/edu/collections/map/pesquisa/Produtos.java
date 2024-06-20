package edu.collections.map.pesquisa;

public class Produtos {
    
    private String nome;
    private int quantidade;
    private double preco;

    public Produtos(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }
    public int getQuantidade() {
        return quantidade;
    }
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "\n" + "Produtos:---- " + nome + "\n" +
               "Quantidade:-- " + quantidade + "\n" +
               "preco:------- " + preco + "\n";
    }

    
}
