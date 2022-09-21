package estruturascondicionais;

import java.util.Scanner;

public class EstruturasCondicionais {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("First grade: ");
        float n1 = teclado.nextFloat();
        System.out.print("Second grade: ");
        float n2 = teclado.nextFloat();
        float media = (n1 + n2) / 2;
        System.out.println("Média: " + media);
        if (media > 9){
            System.out.println("Parabéns!");
        }
               
        
    }
    
}
