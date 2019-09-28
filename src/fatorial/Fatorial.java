package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        //Variáveis
        Scanner leia = new Scanner(System.in);
        int num = 0;
        int porcentual = 20;
        int porcentagem = 0;

        //Ler número do usuário
        System.out.println("Informe um número: ");
        num = leia.nextInt();
        int fatorial = num;

        //Loop Fatorial
        while (num > 1) {
            fatorial *= (num - 1);
            
            
            num--;
            System.out.print(num);
            System.out.print(" * ");
        }
        //Fim do loop
        
        System.out.println();
        System.out.println("Fatorial: "+fatorial);
        
        //Porcentagem
        porcentagem = (fatorial * porcentual) / 100;
        System.out.println("20% do Fatorial = " + porcentagem);

    }

}
