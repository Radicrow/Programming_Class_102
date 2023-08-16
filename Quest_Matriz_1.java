import java.util.Scanner;

public class Quest_Matriz_1{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        for(int i = 0; i<4;i++){
            for(int j = 0; j<4;j++){
                System.out.printf("Insira o valor de [%d][%d]:", i, j);
                matriz[i][j] = ler.nextInt();
            }



        }    
        for(int k = 0; k<4;k++){
            for(int l = 0; l<4;l++){
                System.out.printf("%d, ", matriz[k][l]);
            }
            System.out.printf("%n");
        }      
        System.out.printf("Diagonal principal: ");
        for(int y = 0; y <4; y++){
            for(int z = 0; z<4;z++){
                if(y == z){
                System.out.printf("%d, ", matriz[y][z]);
                }
        }
    }
}
}

