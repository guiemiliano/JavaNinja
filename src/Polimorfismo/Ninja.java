package Polimorfismo;

public abstract class Ninja implements EstragiaDeBatalhaNinja {

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

    //Método geral, todos os ninjas tem
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial");
    }

    @Override
    public void estrategiaNinja() {
        System.out.println("Essa é minha estratégia de batalha");
    }
}
