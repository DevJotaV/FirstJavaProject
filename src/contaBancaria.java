import java.util.Scanner;

public class contaBancaria {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String conta = "corrente";
        double saldo = 1599.50;
        int opcao = 0;

        System.out.println("*********************************************");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo de conta: " + conta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("\n*******************************************");

        String menu = """
                1. Consultar saldo atual
                2. Trasferir valor
                3. Receber valor
                4. Sair.
                """;

        Scanner leitura = new Scanner(System.in);

    while (opcao != 4) {
        System.out.println(menu);
        opcao = leitura.nextInt();

        if (opcao == 1) {
            System.out.println("Seu saldo atual: " + saldo);
        } else if (opcao == 2) {
            System.out.println("Qual valor você deseja transferir: ");
            double valor = leitura.nextDouble();
            if (valor > saldo) {
                System.out.println("Não há saldo para realizar a transferência: ");
            } else {
                saldo -= valor;
                System.out.println("Novo Saldo: " + saldo);
            }
        } else if (opcao == 3) {
            System.out.println("Valor recebido: ");
            double valor = leitura.nextDouble();
            saldo += valor;
            System.out.println("Novo Saldo: " + saldo);
        } else if (opcao != 4) {
            System.out.println("Opcao invalida!");
        }
    }

    }
}
