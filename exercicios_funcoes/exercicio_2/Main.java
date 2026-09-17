public class Main {

    static void nota(String nome, int nota){
        if (nota >= 7){
            System.out.println(nome + " voce passou de ano com: " + nota);
        } else {
            System.out.println(nome + " voce reprovou de ano com: " + nota);
        }
    }
    public static void main(String[] args) {
        nota("Joao",5);
    }
}