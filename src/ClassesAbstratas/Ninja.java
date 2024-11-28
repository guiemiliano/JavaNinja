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

    //Também posso ter métodos comuns ou abstratos

    //Método abstrato
    public abstract void nomeDoNinja();

    //Método comum
    public void tacarShuriken(){
        System.out.println(nome + " jogou uma Shuriken abstrata");
    }


}
