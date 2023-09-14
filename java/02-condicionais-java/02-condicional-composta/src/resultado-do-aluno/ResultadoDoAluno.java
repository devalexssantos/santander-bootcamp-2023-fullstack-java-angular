public class ResultadoDoAluno {
    public static void main(String[] args) throws Exception {
        
        double nota1 = 7.3;
        double nota2 = 5.3;
        double nota3 = 8.5;

        double media = (nota1 + nota2 + nota3) / 3;

        if(media >= 7) { 
            System.out.println("Nota: " + media + ". Aluno APROVADO!");
        } else {
            System.out.println("Nota: " + media + ". Aluno REPROVADO!");
        }
    }
}
