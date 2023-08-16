import java.util.Scanner;

public class Quest_funct_2 {

    static void Go(int y) {
       for(int j = 1; j<=y;j++){
        System.out.printf("-");
       }
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o valor de x: ");
        int x = ler.nextInt(); 
        if (x<1||x>60){
            System.out.println("Número Inválido");
        }
        else{
        Go(x);
        }
        ler.close();
    }
}