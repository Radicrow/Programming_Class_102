import java.util.Scanner;

public class texto{

    public static boolean txt(String text_1, String text_2){
        
        boolean b = text_1.endsWith(text_2);
        return b;
    }
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        System.out.println("Insira o texto 1");
        String text_1 = ler.next();
        System.out.println("Insira o texto 2");
        String text_2 = ler.next();


        ler.close();
        System.out.println(txt(text_1,text_2));
    }
}