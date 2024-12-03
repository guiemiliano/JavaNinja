package HerancaMultipla;

public abstract class Ninja {
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

    public void habilidadeEspecial(){

    }

}
