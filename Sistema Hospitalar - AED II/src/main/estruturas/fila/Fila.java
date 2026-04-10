package estruturas.fila;
public class Fila{
private No primeiro, ultimo;
private int tamanho;


public Fila() {
    this.primeiro = null;
    this.ultimo = null;
    this.tamanho = 0;
}

public void enqueue(Object element) {
    No novoNo = new No(element);

    if (isEmpty()) {
        ultimo = primeiro = novoNo;
        // ultimo = novoNo;
    } else {
        ultimo.setProximo(novoNo);
        ultimo = novoNo;
    }
    tamanho++;
}

public void dequeue() {
    if (isEmpty()) {
        throw new IllegalStateException("Não é possível remover de uma fila vazia");
    }
    primeiro = primeiro.getProximo();
    tamanho--;

    if (isEmpty()) {
        ultimo = null;
    }
}

public Object peek() {
    if (isEmpty()) {
        throw new IllegalStateException("Não é possível visualizar uma fila vazia");
    }
    return primeiro.getElemento();
}

public Object peekAndDequeue() {
    Object elemento = peek();
    dequeue();
    return elemento;
}

public boolean isEmpty() {

    return primeiro == null;
}

public int size() {
    return tamanho;
}


public No getPrimeiro() {
    return primeiro;
}

public void setPrimeiro(No primeiro) {
    this.primeiro = primeiro;
}

public No getUltimo() {
    return ultimo;
}

public void setUltimo(No ultimo) {
    this.ultimo = ultimo;
}

public int getTamanho() {
    return tamanho;
}

public void setTamanho(int tamanho) {
    this.tamanho = tamanho;
}

}