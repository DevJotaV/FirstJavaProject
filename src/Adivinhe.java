import java.util.Random;
import java.util.Scanner;

public class Adivinhe {
    public static void main(String[] args) {
        Scanner leituraNumero = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativa;

        for (tentativa = 0; tentativa < numeroAleatorio; tentativa++) {
            System.out.println("Advinhe o nuemro de 1 a 100: ");
            int numero = leituraNumero.nextInt();

            if (numero == numeroAleatorio) {
                break;
            }
            if (tentativa >= 4) {
                System.out.println("acabaram as tentativas");
                System.out.println("o numero secreto era: " + numeroAleatorio);
                break;
            }
        }
    }
}
