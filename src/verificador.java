import java.util.Scanner;

public class verificador {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = leitura.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Esse numero é par");
        } else {
            System.out.println("esse numero é impar");
        }
    }
}
