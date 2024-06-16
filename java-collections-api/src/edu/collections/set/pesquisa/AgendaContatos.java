package edu.collections.set.pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos(){
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatoPorNome.add(c);
            }
        }
        return contatoPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }


    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.exibirContatos();

        agendaContatos.adicionarContato("Caio", 998989999);
        agendaContatos.adicionarContato("Caio", 998989998);
        agendaContatos.adicionarContato("Caio Tucano", 998989997);
        agendaContatos.adicionarContato("Caio R Tucano", 998989996);
        agendaContatos.adicionarContato("Lucivania Chaves", 998989995);

        agendaContatos.exibirContatos();

        System.out.println(agendaContatos.pesquisarPorNome("Lucivania"));

        System.out.println(agendaContatos.atualizarNumeroContato("Caio", 998989994));
        agendaContatos.exibirContatos();
    }   
}