package desafio_a4;

public class ContaBanco {

    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

        public void estadoAtual(){
        System.out.println("========================");
        System.out.println("Conta: "+ getNumConta());
        System.out.println("Dono: "+ getDono());
        System.out.println("Saldo: "+getSaldo());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Status: "+ isStatus());
        System.out.println("========================");

    }

        public void ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }

        public void abrirConta(String t) {
        setTipo(t);

            if ("CC".equals(t)) {
                setStatus(true);
                this.saldo = 100;
                System.out.println("Conta aberta com sucesso");
            } else if ("CP".equals(t)) {
                setStatus(true);
                this.saldo = 150;
                System.out.println("Conta aberta com sucesso");
            } else {
                System.out.println("Digite o caractér corretamente: ");
            }
        }

        public void fecharConta() {
        if (status) {
            if ( getSaldo() > 0) {
                System.out.println("Sua conta possue dinheiro");
            }else if(getSaldo()<0){
                System.out.println("Sua conta está em débito");
            } else  {
                setStatus(false);
                System.out.println("Conta fechada com sucesso");
            }
        } else {
            System.out.println("Você não tem uma conta aberta!");
        }
    }

        public void depositar (double v) {
            if (isStatus()) {
                setSaldo(getSaldo()+v);
                System.out.println("Foi depositado R$" + v+ " em sua conta!");
            }else {
                System.out.println("Impossível depositar");
            }
        }

        public void sacar(double v) {
            if (isStatus()) {
                if (v<=getSaldo()) {
                    setSaldo(getSaldo() - v);
                    System.out.println("Saque realizado na conta de "+ this.getDono());
                } else {
                    System.out.println("Saldo para saque insuficiente");
                }
            }else {
                System.out.println("Conta não existente");
            }
        }

        public void pagarMensal () {
           int v=0;
           if(this.getTipo() == "CC"){
               v =12;
           }else if(this.getTipo()=="CP"){
               v=20;
           }
           if(status){
               if(this.saldo>0){
                   setSaldo(getSaldo()-v);
               }else {
                   System.out.println("Saldo insuficiente");
               }
           }else {
               System.out.println("Conta não existe");
           }
        }

        public int getNumConta () {
            return numConta;
        }

        public void setNumConta ( int numConta){
            this.numConta = numConta;
        }

        public String getTipo () {
            return tipo;
        }

        public void setTipo ( String tipo ){
            this.tipo = tipo;
        }

        public String getDono () {
            return dono;
        }

        public void setDono (String dono){
            this.dono = dono;
        }

        public double getSaldo () {
            return saldo;
        }

        public void setSaldo ( double saldo){
            this.saldo = saldo;
        }

        public boolean isStatus () {
            return status;
        }

        public void setStatus ( boolean status){
            this.status = status;
        }
    }
