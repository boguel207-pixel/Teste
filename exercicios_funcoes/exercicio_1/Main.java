public class Main {
    static void maior_menor(int n){
        if (n == 0){
            System.out.println(n + " eh igual");
        }
        if (n > 0){
            System.out.println(n + " eh maior que zero");
        }
        if (n < 0){
            System.out.println(n + " eh menor que zero");
        }
    }

    public static void main(String[] args) {
        maior_menor(-10);
    }
}