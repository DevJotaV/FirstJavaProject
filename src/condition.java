public class condition {
    public static void main(String[] args) {
        int anoDeLancamento = 2020;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";

        if (anoDeLancamento >= 2022){
            System.out.println("lancamentos que os clientes estao curtindo");
        } else {
            System.out.println("filme retro que vale pena assistir");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("filme liberado");
        } else {
            System.out.println("pague a o plano plus");
        }
    }
}
