public class calendario {
    public static void main(String[] args) {
        // Defina o dia, mês e ano diretamente no código
        int dia = 15;  // por exemplo, 1
        int mes = 11;  // por exemplo, janeiro
        int ano = 2024;  // por exemplo, 2024

        // Ajuste de meses para a fórmula de Zeller
        if (mes == 1) {
            mes = 13;
            ano--;
        } else if (mes == 2) {
            mes = 14;
            ano--;
        }

        // Fórmula de Zeller
        int k = ano % 100;  // últimos dois dígitos do ano
        int j = ano / 100;  // primeiros dois dígitos do ano
        int diaDaSemana = (dia + 13 * (mes + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;

        // Mapeando o resultado para os dias da semana
        String[] dias = { "Sábado", "Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira" };
        System.out.println("O dia da semana é: " + dias[diaDaSemana]);
    }
}

