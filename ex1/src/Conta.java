

public class Conta {
    private static int ultimoID = 0;
    private int idConta = 0;
    private String numeroConta;
    private double saldo;

    public Conta(){
        this.numeroConta = numeroConta;
        saldo = 0;
        App.ultimoID++;
        idConta = App.ultimoID;

    }
    public int getidConta() {
        return idConta;
    }
    public String getNumeroConta(){
        return numeroConta;
    }

    public static int getUltimoID() {
        return App.ultimoID;
    }
    

    
}