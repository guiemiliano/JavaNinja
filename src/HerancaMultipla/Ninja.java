package HerancaMultipla;

public abstract class Ninja implements EstrategiaDeBatalha{
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    Rank rank;


    //TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas, Rank
    //TODO: Rank: Genin, Chuunin, Jounin, Kage
    //TODO: SOBRECARGA DO CONSTRUTOR CHAMANDO OS NOVOS ATRIBUTOS

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, Rank rank) {
        //Sobrecarga de métodos
        //Referência aos outros atributos do construtor, não faz sentido fazer em várias linhas
        this(nome,aldeia,idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja() {
    }

    //vira praticamente uma constante, imutável
    final void tacarKunai(){
        System.out.println("Sou um método da super classe");
    }

    public void habilidadeEspecial(){

    }

    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " e essa é minha estratégia de combate");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Meu nome é " + nome + " e essa é minha inteligência de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if(qi >= 150){
            System.out.println("Sou um Ninja muito poderoso");
        }else if(qi < 149 && qi >= 120){
            System.out.println("Sou um Ninja poderoso");
        }else if(qi < 120){
            System.out.println("Sou um Ninja comum");
        }else{
            System.out.println("Sou um Ninja fraco");
        }
        System.out.println(nome + " meu QI é de: " + qi);

    }
}
