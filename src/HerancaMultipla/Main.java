package HerancaMultipla;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 16;

        naruto.tacarKunai();
        System.out.println(naruto.altura);

        Bijuu killerBee = new Bijuu();

        killerBee.souJinchuuriki();
        killerBee.nome = "Killer Bee";
        killerBee.souJinchuuriki();


    }
}
