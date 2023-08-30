import java.util.Scanner;

public class punct{
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int[] pontuacao = new int[3];
        System.out.println("Insira a pontuacao");
        String pont_in = ler.next();

        char[] pont_out = new char[pont_in.length()];

        ler.close();

        for(int i = 0; i <pont_in.length(); i++){

            pont_out[i] = pont_in.charAt(i);

            if(pont_out[i] == 'A'){
             pontuacao[0]++;
            }
            else if (pont_out[i] == 'B'){
                pontuacao[1]++;
               }
            else if  (pont_out[i] == 'C'){
                pontuacao[2]++;
               }
        }
        System.out.printf("[%d,%d,%d]", pontuacao[0], pontuacao[1], pontuacao[2]);
        
    }
}