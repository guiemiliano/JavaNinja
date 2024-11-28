package Construtores;

public class Senju extends Hokage{

    @Override
    public void sabedoriaHokage() {
        System.out.println(nome + " ganhou a sabedoria de um Hokage");
    }

    public Senju() {
    }

    public Senju(int idade) {
        super(idade);
    }

    public Senju(String nome, int idade, boolean vivoOuNao) {
        super(nome, idade, vivoOuNao);
    }

    public Senju(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes, double saldoBancario, double altura) {
        super(nome, idade, vivoOuNao, aldeia, missoes, saldoBancario, altura);
    }
}
