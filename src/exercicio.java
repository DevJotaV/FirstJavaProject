public class exercicio {
    public static void main(String[] args) {
        int celsius = 35;
        double fahrenheit = (celsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %s Celsius é igual a %.2f Fahrenheit", celsius, fahrenheit);

        System.out.println(mensagem);

        int fahrenheitint = (int) fahrenheit;
        System.out.println(fahrenheitint);

    }
}

