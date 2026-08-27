public class Main_4 {
    public static void main(String[] args) {
        String saudacao = "Hello World";
        System.out.println(saudacao.length());
        System.out.println(saudacao.toUpperCase());
        System.out.println(saudacao.toLowerCase());

        String aluno_1 = "Claudio";
        String aluno_2 = "Renato";
        System.out.println(aluno_1.equals((aluno_2)));
        
        String mensagem =  "Hello World";
        System.out.println("-" + mensagem.trim() + "-");

        String nome = "Jailson";
        String sobrenome = "Mendes";
        System.out.println(nome + " " + sobrenome);

        String aluno_3 = "Pomba da Paz";
        System.out.println(aluno_3.contains("Paz"));

        String frutas = String.join("-","Laranja","Banana");
        System.out.println(frutas);

        String nome_completo = "Chica Bioca";
        System.out.println(nome_completo.replace("a","o"));

        String frase = "Repetição com mmcorreção\" leva á \"Perfeição\"";
        System.out.println(frase);
    }
}
