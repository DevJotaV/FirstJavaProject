import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner leituraCalculo = new Scanner(System.in);
        String menu = """
                Menu de Calculos
                Digite 1 para calcular a area do circulo
                Digite 2 para calcular a area do quadradro
                """;
        System.out.println(menu);
        int calculoEscolido = leituraCalculo.nextInt();

        if (calculoEscolido == 1) {
            System.out.println("Digite o raio do circulo");
            int raioDigitado = leituraCalculo.nextInt();
            double areaDoCirculo = raioDigitado * 3.14;
            System.out.println("A area do circulo é = " + areaDoCirculo);
        } else if (calculoEscolido == 2) {
            System.out.println("Digite o comprimento do quadradro");
            int comprimentoDigitado = leituraCalculo.nextInt();
            double areaDoQuadradro = comprimentoDigitado * comprimentoDigitado;
            System.out.println("A area do quadrado = " + areaDoQuadradro);
        }


    }
}
