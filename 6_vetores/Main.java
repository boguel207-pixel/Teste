public class Main {
    public static void main(String[] args){
        String[] produtos = {"detergente","pao","manteiga","feijao","pasta"};

        for(int i = 0; i <= 4; i++){
            System.out.println(produtos[i]);
        }
        
        for(String comidas : produtos){
            System.out.println(comidas);
        }

        int[] numeros = {1,0,-2,50,-1};
        for(int numero : numeros){
            if (numero > 0) {
                System.out.println(numero + " eh POSITIVO");
            } else if (numero < 0) {
                System.out.println(numero + " eh NEGATIVO");
            } else {
                System.out.println(numero + " eh ZERO");
            }
        }
    }    
}
