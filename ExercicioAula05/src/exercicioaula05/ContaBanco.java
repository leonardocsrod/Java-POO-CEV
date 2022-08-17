package exercicioaula05;

public class ContaBanco {
    //atributes
    public String tipo;
    public int numeroConta;
    public String nomeCliente;
    public float saldo;
    public float deposito;
    public float saque;
    public boolean situacao;
    
    public ContaBanco(String t, int nc, String ncl){
        this.tipo = t;
        this.numeroConta = nc;
        this.nomeCliente = ncl;
        this.abrirConta();
    }
    
    //methods
    public void abrirConta(){
        this.situacao = true;
        this.saldo = 0.0f;
    }
    public void fecharConta(){
        this.situacao = false;
    }
    public void depositar(float dep){
        this.deposito = dep;
        this.saldo = this.saldo + this.deposito;
    }
    public void sacar(float sac){
        this.saque = sac;
        this.saldo = this.saldo - this.saque;
    }
    public void extrato(){
        if (situacao == true) {
            System.out.println("Situação: Aberta");
        }
        if (situacao == false) {
            System.out.println("Situação: Fechada");
        }
        System.out.println("Tipo de conta: " + this.tipo);
        System.out.println("Número da conta: " + this.numeroConta);
        System.out.println("Nome do cliente: " + this.nomeCliente);
        System.out.println("Saldo: " + this.saldo);
    }
    
    
}
