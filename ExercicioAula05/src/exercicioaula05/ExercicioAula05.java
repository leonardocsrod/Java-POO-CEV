package exercicioaula05;

public class ExercicioAula05 {

    public static void main(String[] args) {
        ContaBanco conta1 = new ContaBanco("Poupanca", 001, "Jubileu");
        conta1.depositar(300);
        ContaBanco conta2 = new ContaBanco("Conta Corrente", 002, "Creuza");
        conta2.depositar(500);
        conta2.sacar(400);
        conta1.extrato();
        conta2.extrato();
    }
    
}
