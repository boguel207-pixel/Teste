public class Main {

    static void tabuada(int n, int i){
        if (i<=10){
            int resultado = n*i;
            System.out.println(n + "x" + i + "=" + resultado);
            i+=1;
            tabuada(n,i);
        }
    }
    public static void main(String[] args) {
        tabuada(5,1);
    }
}