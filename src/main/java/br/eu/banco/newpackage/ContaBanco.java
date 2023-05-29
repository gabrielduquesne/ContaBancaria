package br.eu.banco.newpackage;


public class ContaBanco {
     public int nmrConta;
    private String tipo;
    private String dono;
    private  float saldo;
    private boolean status;
    
    public void estadoAtual(){
        System.out.println("-----------------------------");
        System.out.println("Conta" +  this.getNmrConta());
        System.out.println("Tipo " + this.getTipo());
        System.out.println("Dono " + this.getDono());
        System.out.println("Saldo " + this.getSaldo());
        System.out.println("Status" + this.getStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if(t == "CC"){
            this.saldo = 50;
            this.setSaldo(50);
        }else if (t =="CP"){
            this.setSaldo(150);
        } System.out.println("Conta criada com sucesso!" + "\n");
    }   
    public void fecharConta(){
        if(this.getSaldo() > 0){
            System.out.println("Conta n pode ser fechada pois ainda tem dinheiro");
        }else if (this.getSaldo() < 0){
            System.out.println("Não pode ser fechada pois possui débitos");
        }else{
            this.setStatus(false);
            System.out.println("Conta fechada");
        }
    }
    public void depositar(float v){
        if (this.getStatus()){
            //this.saldo = this.saldo + v;
            this.setSaldo(this.getSaldo() + v);
            System.out.println("deposito realizado com sucesso");
        }else {
            System.out.println("Impossivel depositar");
        }
    }
    public void sacar(float v){
        if (this.getStatus()){
           if (this.getSaldo() >= v){
              this.setSaldo(this.getSaldo() - v);
               System.out.println("Saque realizado na conta de:" + this.getDono());
           }else{
               System.out.println("Saldo insuciente ");
           }
        }else {
            System.out.println("Impossivel sacar de uma conta fechada");
        }
    }
    public void pagarMensalidade(){
        int v = 0;
        if(this.getTipo() == "CC"){
            v = 12;
        }else if (this.getTipo() == "CP") {
            v = 20;
        }
        if (this.getStatus()){
            this.setSaldo(this.getSaldo() - v );
            System.out.println("Mensalidade paga com sucesso por " + this.getDono());
        }else {
            System.out.println("Impossível pagar uma conta fechada");
        }
    }

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

    

    public int getNmrConta() {
        return nmrConta;
    }

    public void setNmrConta(int nmrConta) {
        this.nmrConta = nmrConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
}


