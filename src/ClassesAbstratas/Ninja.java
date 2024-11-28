package ClassesAbstratas;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //Método abstrato
    public abstract void nomeDoNinja();

}
