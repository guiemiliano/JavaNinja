package HerancaMultipla;

public class Uchiha extends Ninja implements Sharingan{

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, Rank rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Uchiha() {
        super();
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + " ativou o Sharingan");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu Ataque Uchiha, um ataque de fogo");
    }
}
