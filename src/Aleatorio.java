import java.util.Random;
public class Aleatorio {

    //Mini projeto gerador de frases, fiz usando pesquisas em livros e na internet!

    public static void main(String[] args) {
        String[] wordListOne = {"Paz", "Alegria", "Felicidade"};
        String[] wordListTwo = {"Sorriso", "Festa", "Comemoração"};
        String[] wordListThree = {"Jogos", "Lol", "Música"};

        int lenght1 = wordListOne.length;
        int lenght2 = wordListTwo.length;
        int lenght3 = wordListThree.length;

        Random randomGenerator = new Random();

        int rand1 = randomGenerator.nextInt(lenght1);
        int rand2 = randomGenerator.nextInt(lenght2);
        int rand3 = randomGenerator.nextInt(lenght3);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        System.out.println(phrase);


    }

}
