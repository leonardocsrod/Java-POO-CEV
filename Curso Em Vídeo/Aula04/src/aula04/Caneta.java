package aula04;

public class Caneta {
    
    
    //atributes
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;
       
    /*
    //construct
    public Caneta(String m, String c, float p, int ca){
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.carga = ca;
        this.tampar();
    }
    
    //getters and setters methods - set está invertido
    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        m = this.modelo;
    }
    public String getCor(){
        return this.cor;
    }
    public void setCor(String c){
        c = this.cor;
    }
    public float getPonta(){
        return this.ponta;
    }
    public void setPonta(float p){
        p = this.ponta;
    }
    public int getCarga(){
        return this.carga;
    }
    public void setCarga(int ca){
        ca = this.carga;
    }
    public boolean getTampada(){
        return this.tampada;
    }
    public void setTampada(boolean t){
        t = this.tampada;
    }
    
    //Methods
    public void tampar(){
        this.tampada = true;
    }
    public void destampar(){
        this.tampada = false;
    }
    
    
    */

    public Caneta(String modelo, String cor, float ponta, int carga, boolean tampada) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean getTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
    
    public void status(){
        System.out.println("Sobre a caneta: ");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.getCor());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Carga: " + this.getCarga());
        System.out.println("Situação: " + this.getTampada());
    }
    
}
