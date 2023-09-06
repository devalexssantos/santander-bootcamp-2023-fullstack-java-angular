public class Soma {

    public static void main(String [] args) {

        String num1 = args[0];
        String num2 = args[1];

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        int soma = n1 + n2;
        
        System.out.println("A soma entre: " + num1 + " e " + num2 + ", é igual a: " + soma + ".");     
    }


}