import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {

    public static void sacarDinheiro() {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        int saldo = 3500;

        System.out.println("Qual valor deseja sacar?");
        int valorSacado = scan.nextInt();

        if(valorSacado <= saldo) {

            saldo = saldo - valorSacado;
            System.out.println("Saque no valor de R$" + valorSacado + ", realizado com sucesso!");
        }

        System.out.println("Saldo atual: " + saldo);
    
    }


}