import java.util.concurrent.ThreadLocalRandom;

public class TesteWhile {
    public static void main(String[] args) throws Exception {

        double mesada = 50;

        while(mesada > 0) {

            double valorDoDoce = valorAleatorio();

            if(valorDoDoce > mesada) {
                valorDoDoce = mesada;
            }

            mesada = mesada - valorDoDoce;

            System.out.println("Doce no valor de: " + valorDoDoce + ", adicionado ao carrinho. Resta: R$" + mesada);
        }

        System.out.println("Mesada: " + mesada);
        System.out.println("Joãozinho gastou toda sua mesada em doces!");
    }

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 10);
    }
}
