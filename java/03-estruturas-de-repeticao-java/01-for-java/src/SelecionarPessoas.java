import java.util.Arrays;

public class SelecionarPessoas {
    public static void main(String[] args) {

        String participantes [] = {"Alex Silva", "Alisson", "Arthur", "Beto", "Breno", "Caio", "Cláudio", "Dácio", "Debboa", "Diego", "Eliab", "Franklin", "Italo", "Jefferson", "Márcio", "Mardonio", "Matheus", "Pepeu", "Rafael", "Samuel", "Thiago", "Túlio", "Valter", "Wesley"};
        double nums [] = new double[24];

        for(int i = 0; i < participantes.length; i++) {
            double numeroTemporario = numerosRandomicos();

            nums[i] = numeroTemporario;

            System.out.println(nums[i] + ": " + participantes[i]);
        }
    }

    private static double numerosRandomicos() {

        int min = 1;
        int max = 24;
        int range = max - min + 1;

        double numeroAleatorio = Math.ceil(Math.random() * range);

        return numeroAleatorio;
    }
}