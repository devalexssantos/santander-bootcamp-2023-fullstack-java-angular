public class tiposVariaveis {
    public static void main(String[] args) {
        
        String meuNome = "Alex";
        String meuSobrenome = "Santos";
        int anoNascimento = 1993;
        final int ANO_2023 = 2023;

        String apresentacao = "Olá, " + "meu nome é: " + retornarNomeCompleto(meuNome, meuSobrenome) + " e minha idade é: " + calcularIdade(ANO_2023, anoNascimento) + " anos";

        System.out.println(apresentacao);

    }

    public static String retornarNomeCompleto (String nome, String sobrenome) {
        return nome + " " + sobrenome;
    }

    public static int calcularIdade (int anoAtual, int anoNascimento) {
        int idade = anoAtual - anoNascimento;

        return idade;
    }
}
