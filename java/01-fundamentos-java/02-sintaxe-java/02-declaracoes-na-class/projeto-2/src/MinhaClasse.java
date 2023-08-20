public class MinhaClasse {
    public static void main (String [] args) { //Método principal

        String primeiroNome = "Alex";
        String ultimoNome = "Santos";

        String nomeCompleto = retornarNomeCompleto (primeiroNome, ultimoNome); //Chamada do método auxiliar no método principal
        System.out.print ("Nome completo: " + nomeCompleto);
    }

    public static String retornarNomeCompleto (String nome, String sobrenome) { //Método auxiliar

        return nome.concat(" ").concat(sobrenome);
    }
}
