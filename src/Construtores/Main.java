package Construtores;

public class Main {
    public static void main(String[] args) {

        Senju hashirama = new Senju();
        hashirama.nome = "Hashirama Senju";
        hashirama.idade = 56;
        hashirama.vivoOuNao = false;
        hashirama.sabedoriaHokage();

        Senju tobirama = new Senju("Tobirama Senju", 45, false);


    }
}
