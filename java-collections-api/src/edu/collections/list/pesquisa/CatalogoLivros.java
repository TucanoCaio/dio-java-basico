package edu.collections.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao){
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor){
        List<Livro> livrosPorAutor = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for (Livro l : livroList){
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){
        List<Livro> livrosPorAno = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for(Livro l : livroList){
                if (l.getAnoPublicacao()>=anoInicial&&l.getAnoPublicacao()<=anoFinal){
                    livrosPorAno.add(l);
                }
            }
        }
        return livrosPorAno;
    }

    public Livro pesquisarPorTitulo(String titulo){
        Livro livrosPorTitulo = null;

        if (!livroList.isEmpty()) {
            for (Livro l : livroList){
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livrosPorTitulo = l;
                }
                break;
            }
        }
        return livrosPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("Livro 1", "Autor 1", 1999);
        catalogoLivros.adicionarLivro("Livro 2", "Autor 1", 2000);
        catalogoLivros.adicionarLivro("Livro 3", "Autor 1", 2002);
        catalogoLivros.adicionarLivro("Livro 4", "Autor 2", 1999);
        catalogoLivros.adicionarLivro("Livro 5", "Autor 2", 2002);
        catalogoLivros.adicionarLivro("Livro 6", "Autor 3", 2019);
        catalogoLivros.adicionarLivro("Livro 7", "Autor 4", 2022);
        catalogoLivros.adicionarLivro("Livro 1", "Autor 5", 2002);

        //System.out.println(catalogoLivros.pesquisarPorAutor("Autor 2"));
        //System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2000, 2019));
        //System.out.println(catalogoLivros.pesquisarPorTitulo("Livro 1"));
    }
    
}

