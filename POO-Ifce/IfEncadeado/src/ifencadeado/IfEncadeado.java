package ifencadeado;

public class IfEncadeado {

    public static void main(String[] args) {
        int marcacao = 65;
        if(marcacao < 50){
            System.out.println("Falha");
        }
        else if(marcacao >= 50 && marcacao < 60){
            System.out.println("Grau D");
        }
        else if(marcacao >= 60 && marcacao < 70){
            System.out.println("Grau B");
        }
    }
    
}
