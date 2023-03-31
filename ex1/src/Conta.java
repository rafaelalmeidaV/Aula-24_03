

public class Conta {
    private static int ultimoID = 0;
    private int idConta = 0;
    private String numeroConta;
    private double saldo;

    public Conta(String numeroConta, double saldo, int ultimoID){
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        Conta.ultimoID++;
        idConta = Conta.ultimoID;

    }
    public int getidConta() {
        return idConta;
    }
    public String getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public static int getUltimoID() {
        return Conta.ultimoID;
    }
    

    
}