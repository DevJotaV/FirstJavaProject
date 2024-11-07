import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Insira um numero para saber a tabuada");
        int num = leitura.nextInt();
        int x;


        for (x = 1; x < 11; x++) {
            int resultado = num * x;
            System.out.println(resultado);
        }

    }
}
