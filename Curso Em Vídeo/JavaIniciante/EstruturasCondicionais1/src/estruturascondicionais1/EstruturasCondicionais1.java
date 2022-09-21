package estruturascondicionais1;

import java.util.Calendar;
import java.util.Scanner;

public class EstruturasCondicionais1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digit your birth year: ");
        int birthYear = teclado.nextInt();
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        int idade = year - birthYear;
        System.out.println("Idade: " + idade);
        if (idade >= 18){
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Menor de idade!");
        }
        
    }
    
}
