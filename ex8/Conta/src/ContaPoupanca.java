public class ContaPoupanca extends Conta{
    private double taxaJuros;

    public ContaPoupanca(double taxaJuros, int numero, String nome, double saldo) {
        super(numero, nome, saldo);
        this.taxaJuros=taxaJuros;
    }

    public void atualizarSaldo(){
        this.setSaldo(this.getSaldo() + this.getSaldo()*taxaJuros);
    }
    
}
