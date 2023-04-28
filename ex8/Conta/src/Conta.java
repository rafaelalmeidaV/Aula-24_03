public class Conta{

    private int numero;
    private String nome;
    private double saldo;

    public Conta(int numero, String nome, double saldo){
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public int getNumero(){
        return numero;
    }

    public String getNome(){
        return nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo = saldo + valor;
    }

    public void sacar(double valor){
        if(saldo<valor){
            System.out.println("Saldo insuficiente");
    }
        else{
            this.saldo = saldo - valor;
        }
    }

    

}