public class Main {
    public static void main(String[] args) {

        System.out.println("Screen match");
        System.out.println("Meu malvado favorito 3");

        int anoDeLancamento = 2020;
        String nomeDofilme = "Meu malvado favorito 3";
        System.out.println("Ano do lancamento:" + anoDeLancamento);
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;

        double media = (8.5 + 9.5 + notaDoFilme) / 3;
        System.out.println("media: " + media);
        String sinopse = """
                Filme: Meu malvado favorito
                Gru levando os minions para roubar a lua
                """ + nomeDofilme;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println("classificao:" + classificacao);


    }
}