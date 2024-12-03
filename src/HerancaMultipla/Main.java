package HerancaMultipla;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha("Sasuke Uchiha",
                "Aldeia da Folha", 19);

        sasuke.sharinganAtivado();


        Hatake kakashi = new Hatake("Kakashi Hatake",
                "Aldeia da folha", 35);

        kakashi.numeroDeMissoesConcluidas = 70;
        kakashi.rank = Rank.KAGE;



        kakashi.sharinganAtivado();
        kakashi.ninjaEspecialistaAnbu();
        kakashi.hokageAtivo();
        kakashi.habilidadeEspecial();

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da folha",
                50, 100, Rank.JOUNIN);

        madara.sharinganAtivado();
        madara.habilidadeEspecial();




    }
}
