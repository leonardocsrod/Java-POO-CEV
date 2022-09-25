package estruturacondicionadaswitch;

import java.util.Scanner;

public class EstruturaCondicionadaSwitch {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.print("Quantidade de pernas: ");
        int QtdePernas = scan.nextInt();
        switch(QtdePernas){
            case 1: System.out.println("Uma perna!"); break;
            case 2: System.out.println("Duas pernas!"); break;
            default: System.out.println("Muitas pernas!");
        }
    }
    
}
