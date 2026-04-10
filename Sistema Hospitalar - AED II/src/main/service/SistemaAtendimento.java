package service;

import model.Paciente;
import estruturas.pilha.Pilha;
import estruturas.fila.Fila;
import estruturas.hash.*;
import estruturas.heap.HeapPrioridade;
import estruturas.lista.ListaDuplamenteLigada;

public class SistemaAtendimento {
    private Fila filaNormal;
    private HeapPrioridade filaPrioritaria;
    private TabelaHash tabela;
    private ListaDuplamenteLigada historico;
    private Pilha operacoes;


    public void inserirPaciente(Paciente p) {
        //TODO: Temos ou devemos criar lógica para inserir paciente na fila normal ou prioritária
    }

    public Paciente atenderPaciente() {
        //TODO: Operacao de atender o paciente removendo o da estrutura de dados em que se encontra
        return null;
    }

    public Paciente buscarPaciente(int id) {
        //TODO: Pensar em como buscar paciente atraves do id ou bi, temos que decidir qual e o parametro de busca
        return null;
    }

    public void removerPaciente(int id) {
        //TODO: Remover paciente decidi colocar assim porque com o id seria mais facil em relacao a bi, mas isso é algo que podemos discutir
    }

    public void desfazerUltimaOperacao() {
        //TODO: Desfazer ultima operacao, seja ela inserir ou atender paciente
    }

}