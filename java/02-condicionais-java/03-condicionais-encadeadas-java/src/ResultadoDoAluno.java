public class ResultadoDoAluno {
    public static void main(String[] args) {
    
        double nota = 11;
        String resultado = "Resultado";
        
        if(nota < 0 || nota > 10) {

            resultado = "Nota inválida";

        } else if(nota >= 0 && nota <= 3) {

            resultado = "REPROVADO";

        } else if(nota < 7) {

            resultado = "EM RECUPERAÇÃO";

        } else if(nota < 9) {
            
            resultado = "APROVADO";
        } else if(nota == 10) {
            
            resultado = "PARABÉNS, ALUNO NOTA 10";
        }
        
        String retorno = "Nota: " + nota + " | " + "Resultado: " + resultado + "!";

        System.out.println(retorno);

    }
}
