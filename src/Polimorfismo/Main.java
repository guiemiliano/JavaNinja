package Polimorfismo;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.habilidadeEspecial();
        naruto.estrategiaNinja();

        Uchiha madara = new Uchiha();
        madara.nome = "Madara Uchiha";
        madara.habilidadeEspecial();

        Uchiha shisui = new Uchiha("Shisui Uchiha",
                "Aldeia da folha", 30);

        shisui.habilidadeEspecial();
    }
}
