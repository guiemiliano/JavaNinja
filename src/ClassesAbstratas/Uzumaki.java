package ClassesAbstratas;

public class Uzumaki extends Ninja implements NinjaInterface{
    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é : " + nome + " método da classe UZUMAKI");
    }

    @Override
    public void tacarKunai() {
        System.out.println(nome + " jogou uma Kunai da interface");
    }
}
