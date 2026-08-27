public class Main_ex1 {
    public static void main(String[] args){

        boolean luz = true;
        if (luz) {
            System.out.println("Luz Acesa !!!");
        } else {
            System.out.println("Luz Apagada");
        }
 
        luz = false;
        if (luz) {
            System.out.println("Luz Acesa !!!");
        } else {
            System.out.println("Luz Apagada");
        }

        int i_luz =  10;
        String mensagem = (i_luz > 7) ? "Bom dia!" : "Boa noite";
        System.out.println(mensagem);
    }
}