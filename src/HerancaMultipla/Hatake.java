package HerancaMultipla;

public class Hatake extends Ninja implements Sharingan, Anbu, Hokage{

    public void souHatake(){
        System.out.println(nome + " eu sou um Hatake");
    }

    public Hatake(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, Rank rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Hatake() {
        super();
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + " ativou o Sharingan");
    }

    @Override
    public void ninjaEspecialistaAnbu() {
        System.out.println("Meu nome é "+ nome+ " sou um ninja" +
                " especialista da Anbu");
    }

    @Override
    public void hokageAtivo() {
        System.out.println("Meu nome é "+ nome+ " eu sou um Hokage");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Hatake, um ataque elétrico," +
                " eu já completei: " + numeroDeMissoesConcluidas + " missões");
    }

    @Override
    public void inteligenciaDeCombate() {
        super.inteligenciaDeCombate();
    }


    @Override
    public void estrategiaDeBatalhaNinja() {
        super.estrategiaDeBatalhaNinja();
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        super.inteligenciaDeCombate(qi);
    }
}
