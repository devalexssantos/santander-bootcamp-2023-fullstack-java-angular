public class ParOuImpar {
    public static void main(String[] args) {

        int numero = 6512;
        String resultado = numero % 2 == 0 ? "O número: " + numero + " é PAR" : "O número: " + numero + " é IMPAR" ;

        System.out.println(resultado + "!");
    }
}
