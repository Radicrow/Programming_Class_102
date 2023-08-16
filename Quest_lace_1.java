import java.util.Scanner;


public class Quest_lace_1{
    public static void main(String args[]){
        Scanner ler = new Scanner(System.in);
        
        System.out.printf("Insira a quantidade de combustivel em litros:");
        double litros = ler.nextDouble();

        System.out.printf("\nInsira o tipo de combustível:");
        char tipo = ler.next().charAt(0);

        double Valor = 0;
        
        if (litros <= 20 && ((tipo == "G")|| (tipo == "g"))){
            Valor = (float)(litros * 5.67) * 0.97;
        }

        else if (litros > 20 && ((tipo == "G")|| (tipo == "g"))){
            Valor = (float)(litros * 5.67) * 0.95;
        }

        else if (litros <= 20 && ((tipo == "A")|| (tipo == "a"))){
            Valor = (float)(litros * 4.85) * 0.96;
        }

        else if (litros > 20 && (tipo == "A"|| tipo == "a")){
            Valor = (float)(litros * 4.85) * 0.94;
        }


        System.out.printf("\n\nO preço total eh " + Valor);
           
    }
}