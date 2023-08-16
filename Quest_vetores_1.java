import java.util.Scanner;

public class Quest1{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int num[] = new int[16];



        for(int i = 1;i<=15;i++){
            System.out.println("Insira um valor:");
            int x = ler.nextInt();
            num[i] = x;
        }
        
        for (int l = 1; l <=15; l++){
            int z; 
            z = num[l];
            System.out.printf("%d, ", z); 

            if(z%2 == 0){
            System.out.println("Par");
            }
            else {
              System.out.println("Impar");
            }
        }
    }
}

