package HerancaMultipla;

public class Main {
    public static void main(String[] args) {

        Uchiha sasuke = new Uchiha("Sasuke Uchiha",
                "Aldeia da Folha", 19);

        sasuke.sharinganAtivado();


        Hatake kakashi = new Hatake("Kakashi Hatake",
                "Aldeia da folha", 35);

        kakashi.sharinganAtivado();
        kakashi.ninjaEspecialistaAnbu();
        kakashi.hokageAtivo();



    }
}
