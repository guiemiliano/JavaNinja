package Polimorfismo;

public class Uchiha extends Ninja{

    /*
        super se referencia ao construtor da superclasse nesse caso
     */

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

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
