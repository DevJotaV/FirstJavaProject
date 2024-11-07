public class exercicio2 {
    public static void main(String[] args) {
        //Exercício 1
        double nota1 = 5;
        double nota2 = 7;

        double media = (nota1 + nota2) / 2;
        System.out.println("Média: " + media);

        //Exercício 2
        double x = 5.3;
        int y = 5;

        int resultado = (int) x + y;
        System.out.println("Resultado: " + resultado);

        //Exercício 3
        char s = 's';
        String d = "usto";

        System.out.println(s + d);

        //Execício 4
        double precoProduto = 1.59;
        int quantidade = 5;

        double total = precoProduto * quantidade;

        String mensagem = String.format("Para comprar 1 produto custa %s, temos %d produtos, e para comprar todos são %.2f", precoProduto, quantidade, total);
        System.out.println(mensagem);

        //Exercício 5
        double valorEmDolares = 5.50;
        double valorEmReal = 4.94;
        double conversao =  valorEmDolares * valorEmReal;
        String mensagemConversao = String.format("%s Dolares seriam %.2f reais", valorEmDolares, conversao);
        System.out.println(mensagemConversao);

        //Exercício 6
        double precoOriginal = 15.99;
        double percentualDesconto = 10;

        double descontoTotal = (precoOriginal * percentualDesconto) / 100;
        System.out.println(precoOriginal - descontoTotal);

    }
}

