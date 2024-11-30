package ClassesAbstratas;

public class Uchiha extends Ninja{

    public Uchiha() {
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    //Método do segundo pilar de OOP, Polimorfismo
    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é : " + nome + " método da classe UCHIHA");
    }
}
