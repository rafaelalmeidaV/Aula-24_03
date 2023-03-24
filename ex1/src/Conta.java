

public class Conta {
    private static int ultimoID = 0;
    private int idConta = 0;
    private String numeroConta;
    private double saldo;

    public Conta(String numeroConta){
        this.numeroConta = numeroConta;
        saldo = 0;
        Conta.ultimoID++;
        idConta = Conta.ultimoID;

    }
    public int getidConta() {
        return idConta;
    }
    public String getNumeroConta(){
        return numeroConta;
    }

    public static int getUltimoID() {
        return Conta.ultimoID;
    }
    

    
}