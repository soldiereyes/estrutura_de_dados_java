package Array;

public class VetorTeste {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("João");
        Aluno a2 = new Aluno("Gui");

        Vetor lista = new Vetor();

        lista.adiciona(a1);
        lista.adiciona(a2);
        System.out.println(lista);

        System.out.println(lista.tamanho());
        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);
        System.out.println(lista.tamanho());

        Aluno a3 = new Aluno("Danilo");
        System.out.println(lista.contem(a3));
        System.out.println(lista.contem(a1));

        lista.remove(1);
        System.out.println(lista);

        lista.adiciona(1, a3);
        System.out.println(lista);

    }
}
