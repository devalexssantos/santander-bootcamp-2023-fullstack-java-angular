import java.util.Locale;
import java.util.Scanner;

public class AboutMe2 {
    

    public static void main(String [] args) {

        try (Scanner scan = new Scanner(System.in).useLocale(Locale.US)) {
            System.out.println("Qual o seu nome?");
            String nome = scan.next();

            System.out.println("Qual o seu sobrenome?");
            String sobreNome = scan.next();

            System.out.println("Qual a sua idade?");
            int idade = scan.nextInt();

            System.out.println("Qual a sua altura?");
            Double altura = scan.nextDouble();

            System.out.println("Olá, meu nome é: " + nome + " " + sobreNome + ", tenho: " + idade + " anos e tenho: " + altura + "m de altura.");
        }
    }
}