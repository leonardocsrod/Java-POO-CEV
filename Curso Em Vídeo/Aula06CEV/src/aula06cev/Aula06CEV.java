package aula06cev;

import java.util.Scanner;

public class Aula06CEV {
    /*
     *Aula 06 curso em vídeo
     * - Tipos primitivos 
     * - Outputs
     * - Inputs
    */
    public static void main(String[] args) {
        //declaração de variável
        //int idade = 3;
        //int idade1 = (int)3;//typecast
        //float sal = 1825.554f;
        //float sal = (float)1825.54;
        //Float sal = new Float(1825.54);
        //char letra = 'G';
        //Character letra = new Character('G');
        //Boolean casado = new Boolean(false);
        //boolean casado = (boolean)false;
        //Integer idade2 = new Integer(3);//com classes(objeto) - wrapper class
        //System.out.println("Idade: " + idade);
        //System.out.println("Idade: " + idade2);
        //System.out.println("Idade: " + idade1);
        //System.out.println("Sal: " + sal);
        //System.out.println("Letra: " + letra);
        //System.out.println("Casado: " + casado);
        
        /*
        outputs
        float nota = 8.5f;
        String nome = "Leonardo";
        System.out.println("Sua nota é " + nota);
        System.out.print("Sua nota é " + nota + "\n");
        System.out.printf("%s, sua nota é %.2f.%n", nome, nota);//duas casas decimais
        System.out.format("%s, sua nota é %.2f.%n", nome, nota);//mesmo resultado do printf
        */
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        
        System.out.println("Sua nota é " + nota);
        System.out.print("Sua nota é " + nota + "\n");
        System.out.printf("%s, sua nota é %.2f.%n", nome, nota);//duas casas decimais
        System.out.format("%s, sua nota é %.2f.%n", nome, nota);//mesmo resultado do printf
        
        
    }
    
}
