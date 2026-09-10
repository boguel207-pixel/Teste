public class Main {
    public static void main(String [] args){

        //int[][] numeros= { {1, 4, 2, 0}, {3, 6, 8, 7}, {70, 5968, 5, 514326}, {542, 67, 69, 2020207}};
        int[][] numeros= { 
            {1, 4, 2, 0}, 
            {3, 6, 8, 7}, 
            {70, 5968, 5, 514326}, 
            {542, 67, 69, 2020207}};
            
        System.out.println(numeros[2][3]);//exibir 1

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.println(numeros[i][j]);//exibir todos
            }
        }

        for(int i = 0; i < 4; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(numeros[i][j] + " ");
                if (j == 3){
                    System.out.println("");//exibir todos em formato quadrado
                }
            }
        }
    }
}