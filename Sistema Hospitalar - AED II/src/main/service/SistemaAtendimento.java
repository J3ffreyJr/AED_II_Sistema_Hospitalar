public class SistemaAtendimento{
    private Fila filaNormal;
    private HeapPrioridade filaPrioritaria;
    private TabelaHash tabela;
    private ListaDuplamenteLigada historico;
    private Pilha operacoes;



    public void inserirPaciente(Paciente p){
        //Temos ou devemos criar lógica para inserir paciente na fila normal ou prioritária
    }

    public Paciente atenderPaciente(){
        //
    }

    public Paciente buscarPaciente(int id){
        //Pensar em como buscar paciente atraves do id ou bi, temos que decidir qual e o parametro de busca
    }

    public void removerPaciente(int id){
        //Remover paciente decidi colocar assim porque com o id seria mais facil em relacao a bi, mas isso é algo que podemos discutir
    }

    public void desfazerUltimaOperacao(){
        //Desfazer ultima operacao, seja ela inserir ou atender paciente
    }

}