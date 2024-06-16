package edu.collections.map.operaçõesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String , Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }
    
    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);            
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Caio", 123456);
        agendaContatos.adicionarContato("Caio", 5665);
        agendaContatos.adicionarContato("Caio Tucano", 1111111);
        agendaContatos.adicionarContato("Caio R Tucano", 654987);
        agendaContatos.adicionarContato("Juca Martelo", 1111111);
        agendaContatos.adicionarContato("Caio", 44444);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Juca Martelo");
        agendaContatos.exibirContatos();
        System.out.println("O numero é: " + agendaContatos.pesquisarPorNome("Caio Tucano"));
    }
}
