public class Main {
    public static void main(String[] args) {

        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 17;
        System.out.println(naruto.euSouNinja());


        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 18;

        sasuke.ativarSharingan();


    }
}