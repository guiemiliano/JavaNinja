public class Ninja {
    String nome;
    String aldeia;
    int idade;


    //Método void não retorna valor nenhum, apenas executa


    public String euSouNinja(){
        return "Meu nome é " + nome + " e eu sou um ninja";
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }

    public void mostrarAtributos(){
        System.out.println("Meu nome é : " + nome);
        System.out.println("Tenho " + idade + " anos");
        System.out.println("Sou da " + aldeia);
        System.out.println();
    }
}
