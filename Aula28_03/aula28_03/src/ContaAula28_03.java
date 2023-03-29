public class ContaAula28_03{
    private String numeroConta;
    private double saldo;

    public ContaAula28_03(){        
    }

    public ContaAula28_03(String numeroConta, double saldo ){
        this.numeroConta=numeroConta;
        this.saldo=saldo;
    }
    public  String getNumeroConta(){
        return numeroConta;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setNumeroConta(String string) {
    }
}
