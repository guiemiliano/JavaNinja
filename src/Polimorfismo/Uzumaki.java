package Polimorfismo;

public class Uzumaki extends Ninja{

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " " +
                "e esse é meu ataque Uzumaki utilizando vento");
    }

    @Override
    public void estrategiaNinja() {
        System.out.println("Essa é minha estratégia Ninja Uzumaki");
    }
}
