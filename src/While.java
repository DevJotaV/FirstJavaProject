import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner leituraWhile =  new Scanner(System.in);
        double media = 0;
        double nota = 0;
        double totalDeNotas = 0;

        while (nota != -1) {
            System.out.println("Digite sua avaliacao para o filme");
            nota = leituraWhile.nextDouble();

            if (nota != -1) {
                media += nota;
                totalDeNotas++;
            }


        }
        System.out.println("Media: " + media / totalDeNotas);
    }

}

