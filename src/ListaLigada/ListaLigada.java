package ListaLigada;

public class ListaLigada {
    private Celula primeira = null;
    private Celula ultima = null;
    private int totalDeElementos = 0;


    public void adicionaNoComeco(Object elemento) {
        Celula nova = new Celula(elemento, primeira);
        this.primeira = nova;

        if(this.totalDeElementos ==0){
            this.ultima = this.primeira;
        }

        this.totalDeElementos++;

    }
    // no fim da lista
    public void adiciona(Object elemento) {
        if(this.totalDeElementos == 0) {
            adicionaNoComeco(elemento);

        } else {
            Celula nova = new Celula(elemento, null);
            this.ultima.setProximo(nova);

            this.ultima = nova;

            this.totalDeElementos++;
        }
    }
//    no meio da lista
    public void adiciona(int posicao, Object elemento) {
        Celula anterior = this.pegaCelula(posicao -1);
        Celula nova = new Celula(elemento, anterior.getProximo());

    }
//    Um irá indicar quando a posição existir
    private boolean posicaoOcupada(int posicao) {
        return posicao >= 0 && posicao < this.totalDeElementos;
    }
    private Celula pegaCelula(int posicao) {

        if(!posicaoOcupada(posicao)) {
            throw new IllegalArgumentException("posicao inexistente");
        }

        Celula atual = primeira;

        for(int i = 0; i < posicao; i++) {
            atual = atual.getProximo();
        }
        return atual;
    }




    public Object pega(int posicao) {
        return null;
    }

    public void remove(int posicao) {
    }

    public int tamanho() {
        return 0;
    }

    public boolean contem(Object o) {
        return false;
    }

    @Override
    public String toString() {

        if (this.totalDeElementos == 0) {
            return "[]";
        }

        Celula atual = primeira;

        StringBuilder builder = new StringBuilder("[");

        for (int i = 0; i < totalDeElementos; i++) {
            builder.append(atual.getElemento());
            builder.append(",");

            atual = atual.getProximo();
        }

        builder.append("]");

        return builder.toString();
    }
}
