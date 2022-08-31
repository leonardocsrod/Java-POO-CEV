package aula04;

public class Aula04 {

    public static void main(String[] args) {
        //Caneta c1 = new Caneta("BIC", "Azul", 0.5f, 80);
        Caneta c1 = new Caneta("BIC", "Azul", 0.5f, 80, true);
        
        
        c1.setModelo("BIC");
        c1.setCor("azul");
        c1.setPonta(0.5f);
        c1.setCarga(80);
        c1.setTampada(true);
        
        System.out.println("Caneta " + c1.getModelo());
        c1.status();
    }
    
}
