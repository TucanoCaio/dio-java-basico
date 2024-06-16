package edu.collections.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    
    private List<Tarefa> listaTarefa;

    public ListaTarefas() {
        this.listaTarefa = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> listaRemover = new ArrayList<>();
        for (Tarefa t : listaTarefa){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
            listaRemover.add(t);
            }
        }
        listaTarefa.removeAll(listaRemover);
    }
    public int obterNumeroTotalTarefas(){
        return listaTarefa.size();
    }
    public void obterDescricoesTarefas(){
        System.out.println(listaTarefa);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println("O total de tarefas na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        //listaTarefas.adicionarTarefa("Tarefa 1");
        //listaTarefas.adicionarTarefa("Tarefa 2");
        //listaTarefas.adicionarTarefa("Tarefa 1");
        System.out.println("O total de tarefas na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.removerTarefa("Tarefa 2");
        System.out.println("O total de tarefas na lista é: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricoesTarefas();

    }
}
