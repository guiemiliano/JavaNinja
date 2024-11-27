public class Ninja {
    String nome;
    String aldeia;
    int idade;


    //Método void não retorna valor nenhum, apenas executa
    public void ativarSharingan(){
        System.out.println("Meu nome é " + nome + " e eu ativei o sharingan");
    }

    public String euSouNinja(){
        return "Meu nome é " + nome + " e eu sou um ninja";
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }
}
