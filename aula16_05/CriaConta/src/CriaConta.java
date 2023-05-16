public class CriaConta {
    private String ContaBancaria;
    private String nome;
    private double saldo;

    public String getContaBancaria(){
        return ContaBancaria;
    }

    public void setContaBancaria(String ContaBancaria){
        this.ContaBancaria=ContaBancaria;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
}
