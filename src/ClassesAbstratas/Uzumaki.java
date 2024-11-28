package ClassesAbstratas;

public class Uzumaki extends Ninja{
    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é : " + nome + " método da classe UZUMAKI");
    }
}
