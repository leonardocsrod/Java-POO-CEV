package exercicioenum;

public class ExercicioEnum {

    public enum Semana
        {
            SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO;            
        }
    public static void main(String[] args) {
        
        Semana semana = Semana.TERÇA;
        switch(semana){
            case SEGUNDA: System.out.println("Segunda feira"); break;
            case TERÇA: System.out.println("Terça feira"); break;
            case QUARTA: System.out.println("Quarta feira"); break;
            case QUINTA: System.out.println("Quinta feira"); break;
            case SEXTA: System.out.println("Sexta feira"); break;
            case SABADO: System.out.println("Sábado"); break;
            case DOMINGO: System.out.println("Domingo"); break;            
        }
        /*
        for (Semana semana : Semana.val
                ues()){
            System.out.println(semana);
        }
        */
    }
        
    }   
    