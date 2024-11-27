public class Main {
    public static void main(String[] args) {

        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 17;
        String euSou = naruto.euSouNinja();
        System.out.println(euSou);


        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 18;
        int sasukeHokage = sasuke.anosParaSeTornarHokage(60);
        System.out.println(sasukeHokage);


        sasuke.ativarSharingan();


    }
}