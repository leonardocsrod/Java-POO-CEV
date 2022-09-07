package testetipos;

public class TesteTipos {

    public static void main(String[] args) {
        /*int para String
        //int idade = 30;
        //String valor = idade; não há possibilidade da string receber este valor
        //String valor = Integer.toString(idade);//uso de classe invólucro (método to String)
        //System.out.println("Valor: " + valor);
        String valor = "30";
        //int idade = valor;
        
        System.out.println("Idade: " + idade);
        */
        String valor = "30.5";
        float idade = Float.parseFloat(valor);
        System.out.println("Idade: " + idade);
    }
    
}
