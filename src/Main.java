import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int dificuldade, chances, numeroSecreto, numeroTentado, i;

        // dificuldade do jogo

        System.out.println("Escolha a dificuldade");
        System.out.println("[0 - fácil, 1 - médio, 2 - difici]");
        dificuldade = sc.nextInt();

        chances = 0;

        if (dificuldade == 0) {
            chances = 20;
            System.out.println("DIFICULDADE: FÁCIL ");
        } else if (dificuldade == 1) {
            chances = 10;
            System.out.println("DIFICULDADE: MÉDIA");
        } else if (dificuldade == 2) {
            chances = 5;
            System.out.println("DIFICULDADE: DIFÍCIL");
        } else {
            System.out.println("NÚMERO INVÁLIDO!");
        }

        System.out.println("-------------------------------------"); 

        // Parte lógica do jogo

        System.out.println("Digite o primeiro número: ");
        numeroTentado = sc.nextInt();
        System.out.println("CHANCES: " + chances);
        chances = chances - 1;

        numeroSecreto = random.nextInt(100) + 1;

        if (numeroTentado == numeroSecreto) {
            System.out.println("PARABÉNS!!!");
        } else {

//            o i vai receber o valor de chances que vai mudar de acordo com o nível de dificuldade escolhido.
//            E enquanto o i for maior que 0, então o loop irá iniciar.

            for (i = chances; i >= 0; chances--) {
                if (numeroTentado > numeroSecreto) {
                    System.out.println("O número escolhido é maior que o número secreto");
                } else {
                    System.out.println("O numero escolhido é menor que o número secreto");
                }

                System.out.println("Tente novamente! ");
                numeroTentado = sc.nextInt();
                System.out.println("Chances: " + chances);

                if (chances == 0) {
                    System.out.println("FIM DE JOGO! VOCÊ PERDEU.");
                    System.out.println("O número secreto era: " + numeroSecreto);
                    break;
                } else if (numeroTentado == numeroSecreto) {
                    System.out.println("PARABÉNS!!!");
                    System.out.println("FIM DE JOGO");
                    break;

                }
            }

        }

        sc.close();

    }

}


