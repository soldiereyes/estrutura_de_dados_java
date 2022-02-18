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

    }
}
