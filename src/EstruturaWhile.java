import java.util.concurrent.ThreadLocalRandom;

public class EstruturaWhile {
    public static void main(String[] args) {
        double dinheiro = 60;

        while (dinheiro > 0) {
            double valorProduto = valorAleatorio();
            if (valorProduto > dinheiro) {
                valorProduto = dinheiro;
            }

            dinheiro = dinheiro - valorProduto;
        }
        System.out.println("Dinheiro: " + dinheiro);
        System.out.println("Todo o dinheiro foi gasto!");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 6);
    }
}