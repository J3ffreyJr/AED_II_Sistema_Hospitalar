package estruturas.lista;

public class No {
    private No proximo, anterior;
    private Object elemento;

    public No(Object elemento) {
        this.elemento = elemento;
    }

    public No(No anterior, Object elemento) {
        this.anterior = anterior;
        this.elemento = elemento;
    }

    public No(Object elemento, No proximo) {
        this.proximo = proximo;
        this.elemento = elemento;
    }

    public No(No anterior, Object elemento, No proximo) {
        this.anterior = anterior;
        this.elemento = elemento;
        this.proximo = proximo;
    }

    public No getProximo() {
        return proximo;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public Object getElemento() {
        return elemento;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
}