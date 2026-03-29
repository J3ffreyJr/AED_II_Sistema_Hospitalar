import main.model.Paciente;

public class EntradaHash {
    int chave;
    Paciente valor;
    EntradaHash proximo;

    public EntradaHash(int chave, Paciente valor) {
        this.chave = chave;
        this.valor = valor;
        this.proximo = null;
    }
}