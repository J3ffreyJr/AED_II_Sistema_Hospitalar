package main.model;

public class Paciente {
    private int id;
    private String nome;
    private int idade;
    private String bi;
    private String telefone;
    private String endereco;
    private String prioridade; // Pode ser "normal" ou "prioritario"

   
//Construtor para criar um paciente, o id pode ser gerado automaticamente ou passado como parametro, isso é algo que podemos discutir
    public Paciente (int id, String nome, int idade, String bi, String telefone, String endereco, String prioridade){
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.bi = bi;
        this.telefone = telefone;
        this.endereco = endereco;
        this.prioridade = prioridade;
    }

    //Getters 
    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }    

    public int getIdade(){
        return idade;
    }

    public String getBi(){
        return bi;
    }

    public String getTelefone(){
        return telefone;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getPrioridade(){
        return prioridade;
    }


    //Setters
    public void setId(int id){
        this.id = id;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setBi(String bi){
        this.bi = bi;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setPrioridade(String prioridade){
        this.prioridade = prioridade;
    }

    public String toString(){
        return "Paciente{" + 
        "id=" + id + 
        ", nome='" + nome + 
        '\'' + ", idade=" + idade + 
        ", bi='" + bi + 
        '\'' + ", telefone='" + telefone + 
        '\'' + ", endereco='" + endereco + 
        '\'' + ", prioridade ='" + prioridade + '\'' + '}';
    }

}
/*
id pode ser gerado de forma automatica ou como parametro
podemos txunar:
- de forma automatica que seria criar um contador estatica que incrementa sempre:
......private static int contadorId = 1;
......public Paciente (String nome, int idade, String bi, String telefone, String endereco, String prioridade){
..........this.id = contadorId++;

- de forma manual que seria passar o id como parametro no construtor, isso pode ser interessante para facilitar a busca e remoção de pacientes, mas isso é algo que podemos discutir

*/