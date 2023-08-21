public class operadores {
    public static void main(String[] args) throws Exception {
        
        /*Unários*/
        System.out.println("Unários");
        int numero = 5;

        System.out.println(- numero + 3); //Negativar ou positivar

        //Incremento e decremento
        System.out.println(++numero);
        System.out.println(--numero);
        numero++;
        System.out.println(numero);
        numero--;
        System.out.println(numero);

        //Negação
        boolean camisaBranca = true;
        System.out.println(!camisaBranca);

        /*Binários*/
        System.out.println("Binários");
        int numero2 = 2;

        int resultado;
        
        resultado = numero + numero2;
        System.out.println("Soma: " +  resultado);
        
        resultado = numero - numero2;
        System.out.println("Subtração: " +  resultado);
        
        resultado = numero * numero2;
        System.out.println("Multiplicação: " +  resultado);
        
        resultado = numero / numero2;
        System.out.println("Divisão: " +  resultado);
        
        resultado = numero % numero2;
        System.out.println("Módulo/resto da divisão: " +  resultado);

        /*Ternário*/
        double nota = 9.6;
        String resultadoDoAluno = nota > 6 ? "Aprovado" : "Reprovado";
        System.out.println("Nota: " + nota + " | " + resultadoDoAluno);

        /* 
        Relacionais
         * Igualdade: ==
         * Diferente: !=
         * Maior: >
         * Maior ou igual: >=
         * Menor: <
         * Menor ou igual: <=
         

         Para comparar objetos usa o método equals
         Ex: nome1.equals(nome2);
        */

        /*
        Comparação
         * E - &&
         * OU - ||
        */


    }

}
