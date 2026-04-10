package estruturas.lista;

public class ListaDuplamenteLigada {

    private No primeiro, ultimo;
    private int tamanho;

    public ListaDuplamenteLigada() {
        this.primeiro = null;
        this.ultimo = null;
        this.tamanho = 0;
    }

    public void adicionaInicio(Object element) {
        No novo = new No(null, element, primeiro);

        if (primeiro != null) primeiro.setAnterior(novo);
        primeiro = novo;
        if (tamanho == 0) ultimo = primeiro;
        tamanho++;
    }

    public void adicionaPosicao(int posicao, Object elemento) {
        if (posicao < 0 || posicao > tamanho) {
            System.out.println("Posição inválida: " + posicao);
            return;
        }
        if (tamanho != 0 || posicao != tamanho) {
            No atual = pegaNo(posicao);
            No anterior = atual.getAnterior();

            No novoNo = new No(anterior, elemento, atual);

            anterior.setProximo(novoNo);
            atual.setAnterior(novoNo);
            tamanho++;
        }

        if (tamanho == 0) adicionaInicio(elemento);

        if (posicao == tamanho) adicionaFim(elemento);
    }

    public void adicionaFim(Object elemento) {
        No novoNo = new No(elemento);
        if (tamanho == 0) {
            adicionaInicio(elemento);
        } else {
            novoNo.setAnterior(ultimo);
            ultimo.setProximo(novoNo);
            ultimo = novoNo;
            tamanho++;
        }
    }

    public Object pega(int posicao) {
        return pegaNo(posicao).getElemento();
    }

    public No pegaNo(int posicao) {
        No actual;
        if (posicao < 0 || posicao >= tamanho) {
            throw new IllegalArgumentException("Posição inválida: " + posicao);
        }

        if (posicao < tamanho / 2) {
            actual = primeiro;
            for (int i = 0; i < posicao; i++) {
                actual = actual.getProximo();
            }
            return actual;
        } else {
            actual = ultimo;
            for (int i = tamanho - 1; i > posicao; i--) {
                actual = actual.getAnterior();
            }
            return actual;
        }
    }

    public void removeInicio() {
        if (tamanho == 0) {
            System.out.println("Lista vazia!");
            return;
        }

        if (tamanho == 1) {
            primeiro = null;
            ultimo = null;
        } else {
            primeiro = primeiro.getProximo();
            primeiro.setAnterior(null);
        }
        tamanho--;
    }

    public void removePosicao(int posicao) {
        if (posicao < 0 || posicao >= tamanho) {
            System.out.println("Posição inválida: " + posicao);
            return;
        }

        if (posicao == 0) removeInicio();

        if (posicao == tamanho - 1) removeFim();

        No paraRemover = pegaNo(posicao);
        No anterior = paraRemover.getAnterior();
        No proximo = paraRemover.getProximo();

        anterior.setProximo(proximo);
        proximo.setAnterior(anterior);

        tamanho--;
    }

    public void removeFim() {
        if (tamanho == 0) {
            System.out.println("Lista vazia!");
            return;
        }

        if (tamanho == 1) {
            removeInicio();
        } else {
            ultimo = ultimo.getAnterior();
            ultimo.setProximo(null);
        }
        tamanho--;
    }

    public boolean contem(Object elemento) {
        No atual = primeiro;

        while (atual != null) {
            if (atual.getElemento().equals(elemento)) {
                return true;
            }
            atual = atual.getProximo();
        }
        return false;
    }

    public int tamanho() {
        return tamanho;
    }

    public void imprimirHistorico() {
        //TODO: Imprimir historico de atendimentos, pode ser interessante imprimir o nome do paciente e a data do atendimento
    }

    public void listarPacientes() {
        //TODO: Listar pacientes na fila, pode ser interessante listar o nome do paciente e a prioridade
    }

    // Getters e Setters
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