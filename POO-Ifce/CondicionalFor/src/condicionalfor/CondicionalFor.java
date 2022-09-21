package condicionalfor;

public class CondicionalFor {

    public static void main(String[] args) {
        // TODO code application logic here
        int j;
        for(j = 0; j < 10; j++){
            System.out.println("" + j);
        }
        for(int i = 1, k = i + 10; i < 5; i++, k = i * 2){
            System.out.println("i: " + i + " k: " + k);
        }
    }
    
}
