import java.util.Locale;
import java.util.Scanner;

public class TerminalDeVendas {
    
    public static void main(String [] args) {

        Scanner scan = new Scanner(System.in).useLocale(Locale.US);

        double valorFinalDaCompra = 0;
        String retornoNaTela;
        String modalidade;
        String erro = "Erro";

        System.out.println("Digite o valor da compra: ");
        double valorDaCompra = scan.nextDouble();
        System.out.println("SELECIONE A FORMA DE PAGAMENTO: ");
        System.out.println("1 - Dinheiro ou PIX (5% desconto) | 2 - Débito (Valor normal) | 3 - Até 3x (3% de juros) | 4 - A cima de 3x (juros 10%)");
        int operacao = scan.nextInt();

        switch(operacao) {
            case 1:
                valorFinalDaCompra = valorDaCompra - (valorDaCompra * 0.05);
               
            break;

            case 2: 
                valorFinalDaCompra = valorDaCompra;
            break;

            case 3: 
                valorFinalDaCompra = valorDaCompra + (valorDaCompra * 0.03);                
            break;

            case 4:
                valorFinalDaCompra = valorDaCompra + (valorDaCompra * 0.10);
                System.out.println("Quantas parcelas?");
                int parcelas = scan.nextInt();
            break;

            default:
                erro = "OPÇÃO INVÁLIDA!";

        }

        if(operacao == 1) {
            modalidade = "dinheiro";
        } else if(operacao == 2) {
            modalidade = "cartão de débito";
        } else {
            modalidade = "cartão de crédito";
        }

        if(erro == "OPÇÃO INVÁLIDA!") {

            retornoNaTela = "OPÇÃO INVÁLIDA!";

        } else {

            retornoNaTela = "Sua compra na modalidade: " + modalidade + ", ficou no valor final de R$" + valorFinalDaCompra;

        }

        System.out.println(retornoNaTela);

    }


}
