package Polimorfismo;

public class Uzumaki extends Ninja{

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
