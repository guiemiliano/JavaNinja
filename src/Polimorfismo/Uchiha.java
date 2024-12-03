package Polimorfismo;

public class Uchiha extends Ninja{

    /*
        Override é do segundo pilar de OOP, polimorfismo
     */
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " " +
                "e esse é meu ataque Uchiha utilizando fogo");

    }

    @Override
    public void estrategiaNinja() {
        System.out.println("Essa é minha estratégia Ninja Uchiha");
    }
}
