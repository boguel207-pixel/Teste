public class Main_ex2 {
    public static void main(String[] args){
        String mensagem = "";
        int idade = 18;
        if (idade > 0 && idade < 12){
            mensagem = "criança";
        } else if (idade > 11 && idade < 18){
            mensagem = "adoslecente";
        } else if (idade > 17 && idade < 65){
            mensagem = "adulto";
        } else if (idade > 64){
            mensagem = "idoso";
        }
        System.out.println(mensagem);
    }
}
