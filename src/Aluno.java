public class Aluno {
    private String name;

    public Aluno(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    @Override
    public boolean equals(Object obj){
        Aluno outro = (Aluno) obj;
        return outro.getName().equals(this.name);
    }
    @Override
    public String toString(){
        return name;
    }
}
