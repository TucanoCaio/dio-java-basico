package edu.collections.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long ,Produtos> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produtos(nome, quantidade, preco));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produtos p : estoqueProdutosMap.values()){
                valorTotalEstoque += (p.getPreco()*p.getQuantidade());
            }            
        }
        return valorTotalEstoque;
    }

    public Produtos obterProdutoMaisCaro(){
        Produtos produtoMaisCaro = null;
        double maiorValor = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produtos p : estoqueProdutosMap.values()){
                if (p.getPreco()>maiorValor) {
                    produtoMaisCaro = p;
                    maiorValor = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produtos obterProdutoMaisBarato(){
        Produtos produtoMaisBarato = null;
        double menorValor = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produtos p : estoqueProdutosMap.values()){
                if (p.getPreco()<menorValor) {
                    produtoMaisBarato = p;
                    menorValor = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produtos obterProdutoMaiorValorDeEstoque(){
        Produtos produtoMaiorValorDeEstoque = null;
        double maiorValorDeEstoque = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produtos p : estoqueProdutosMap.values()){
                if (p.getPreco()*p.getQuantidade() > maiorValorDeEstoque) {
                    produtoMaiorValorDeEstoque = p;
                    maiorValorDeEstoque = p.getPreco()*p.getQuantidade();
                }
            }
        }
        return produtoMaiorValorDeEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(1, "Produto A", 10, 5);
        estoqueProdutos.adicionarProduto(2, "Produto B", 5, 10);
        estoqueProdutos.adicionarProduto(3, "Produto C", 2, 15);
        estoqueProdutos.adicionarProduto(4, "Produto D", 50, 2);
        estoqueProdutos.adicionarProduto(5, "Produto E", 1, 1);

        estoqueProdutos.exibirProdutos();

        System.out.println("O valor total do estoque é: " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("O produto mais barato é: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("O mais caro é: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("O produto com maior valor de estoque é: " + estoqueProdutos.obterProdutoMaiorValorDeEstoque());
    }
}
