public class Conta {
    private int numero;
    private double saldo;
    private Pessoa titular;


    public Conta(int numero, double saldo, Pessoa titular) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumero() {
        return numero;
    }


    
    public double getSaldo() {
        return saldo;
    }


    public void setNumero(int numero) {
        this.numero = numero;
    }



    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public Pessoa getTitular() {
        return titular;
        
    }

    public void setTitular(Pessoa titular) {
        this.titular=titular;
    }

    public String toString(){
        return "Numero: " + this.numero + " Saldo: " + this.saldo + " Titular: " + this.titular;
    }
}
