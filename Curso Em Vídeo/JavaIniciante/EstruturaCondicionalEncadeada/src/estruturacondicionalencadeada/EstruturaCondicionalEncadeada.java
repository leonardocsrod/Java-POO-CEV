package estruturacondicionalencadeada;

import java.util.Scanner;
import java.util.Calendar;
public class EstruturaCondicionalEncadeada {

    public static void main(String[] args) {
        System.out.print("Informe sua data de nascimento: ");
        Scanner scan = new Scanner(System.in);
        int nasc = scan.nextInt();
        Calendar dat = Calendar.getInstance();
        int yearToday = dat.get(Calendar.YEAR);
        System.out.println("Nascimento: " + nasc);
        System.out.println("Este ano: " + yearToday);
        int idade = yearToday - nasc;
        if (idade < 16){
            System.out.println("Ainda não pode votar!");
        } else if (idade >= 16 && idade < 18 || idade >= 70){
                System.out.println("O voto é facultativo!");
            } else {
                System.out.println("O voto é obrigatório!");
        }
        } 
        
        
    }
