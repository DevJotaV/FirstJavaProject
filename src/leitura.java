import java.util.Scanner;

public class leitura {
    public static void main(String[] args) {
        Scanner leiturascan = new Scanner(System.in);

        System.out.println("digite seu filme favorito");
        String filme = leiturascan.nextLine();
        System.out.println("qual ano de lancamento");
        int anoDeLancamento = leiturascan.nextInt();
        System.out.println("Diga sua avalicao sobre o filme ");
        double avaliacao = leiturascan.nextDouble();

        System.out.println(filme);
        System.out.println(anoDeLancamento);
        System.out.println(avaliacao);
    }
}
