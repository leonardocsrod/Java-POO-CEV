package testavisibilidade;

public class TestaVisibilidade {

    public static void main(String[] args) {
        int x = 10;
        int y = 100;
        while (x < 100){
            int z = 0;
            //int y = x;
            x++;
            System.out.println("x: " + x);
            System.out.println("y: " + y);
        }
    }
    
}
