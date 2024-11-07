import java.util.Scanner;

public class indentificador {
    public static void main(String[] args) {
        Scanner leituraNumero = new Scanner(System.in);
        System.out.println("digite um número");
         int numeroDigitado = leituraNumero.nextInt();

         if (numeroDigitado > 0) {
             System.out.println("numero positivo");
         } else {
             System.out.println("numero negativo");
         }


        System.out.println("digite um número:");
        int numeroDigitado1 = leituraNumero.nextInt();
        System.out.println("digite outro número");
        int numeroDigitado2 = leituraNumero.nextInt();

        if (numeroDigitado1 > numeroDigitado2) {
            System.out.println("numero 1 é maior que numero 2");
        }
        if (numeroDigitado1 < numeroDigitado2) {
            System.out.println("numero menor que numero");
        }
        if (numeroDigitado1 == numeroDigitado2) {
            System.out.println("numero igual");
        }
    }
}

