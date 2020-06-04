package revisão.pkg1;

import java.util.Scanner;

/**
 *
 * @author troll
 */
public class Revisão1 {

    public static void main(String[] args) {
        Double P, B, valorB, valorP, total, poupanca, resto;
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Quantos pães foram vendidos?");
        P = ler.nextDouble();
        System.out.println("Quantas broas foram vendidas?");
        B = ler.nextDouble();
        valorP = 0.12;
        valorB = 1.50;
        total = valorP*P+valorB*B;
        poupanca = (total/100)*10;
        resto = total-poupanca;
        
        System.out.println("Seu lucro é:"+resto);
        System.out.println("Valor á guardar:" +poupanca);
    }
    
}