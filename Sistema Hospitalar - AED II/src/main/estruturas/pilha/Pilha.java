package estruturas.pilha;

public class Pilha{
    private No topo;
    private int tamanho;

    public Pilha() {
        this.topo = null;
        this.tamanho = 0;
    }

    public void push(Object element) {
        No novoNo = new No(element);

        if (!isEmpty()) {
            novoNo.setProximo(topo);
        }

        topo = novoNo;
        tamanho++;
    }

    public void pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Não é possível remover de uma pilha vazia");
        }

        topo = topo.getProximo();
        tamanho--;
    }

    public Object peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Não é possível visualizar uma pilha vazia");
        }
        return topo.getElemento();
    }

    public Object peekAndPop() {
        if (isEmpty()) {
            throw new IllegalStateException("Não é possível remover de uma pilha vazia");
        }

        Object elementoActual = topo.getElemento();
        pop();
        return elementoActual;
    }

    public boolean isEmpty() {
        return topo == null;
    }

    public int size() {
        return tamanho;
    }

    //Getters e Setters
    public No getPrimeiro() {
        return topo;
    }

    public void setPrimeiro(No primeiro) {
        this.topo = primeiro;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}