package ClassesAbstratas;

public class Main {
    public static void main(String[] args) {
        /*
            Uma classe abstrata não pode ser instanciada, passei
            os seus atributos e métodos para as classes Uchiha e Uzumaki,
            com isso passo a responsabilidade de qualquer alteração somente
            para um lugar, deixando o código mais escalável e seguro, também criei
            construtores dessa classe abstrata e os sobrescrevi nas classes filhas
         */

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 29);

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia =  "Aldeia da folha";
        naruto.idade = 16;



    }
}
