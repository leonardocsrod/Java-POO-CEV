package matriz2;
import java.util.Scanner;
public class Matriz2 {

    public static void main(String[] args) {
        String meses[] = new String[12];
        Scanner scan = new Scanner(System.in);
        for(int i = 0; i <= meses.length - 1; i++){
            System.out.print("Informe o mês " + (i + 1)+ ": ");
            meses[i] = scan.next();
        }
        for(int j = 0; j <= 10; j++){
            System.out.print(meses[j] + ", ");
            
        }
        System.out.println(meses[11]);
        
        for (String k: meses){
            System.out.println(k);
        }
    }
    
}
