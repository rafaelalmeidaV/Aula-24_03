public class AutomovelLuxo extends Automovel{
    private boolean tetoSolar;
    private boolean cambioAutomatico;
    private boolean bancoCouro;

    public AutomovelLuxo(String combustivel, String modelo, String cor, boolean tetoSolar, boolean cambioAutomatico, boolean bancoCouro) {
        super(combustivel, modelo, cor);
        this.tetoSolar = tetoSolar;
        this.cambioAutomatico = cambioAutomatico;
        this.bancoCouro = bancoCouro;
    }

    public boolean getTetoSolar() {
        return tetoSolar;
    }

    public boolean getCambioAutomatico() {
        return cambioAutomatico;
    }

    public boolean getBancoCouro() {
        return bancoCouro;
    }

    public void setTetoSolar(boolean tetoSolar) {
        this.tetoSolar = tetoSolar;
    }

    public void setCambioAutomatico(boolean cambioAutomatico) {
        this.cambioAutomatico = cambioAutomatico;
    }

    public void setBancoCouro(boolean bancoCouro) {
        this.bancoCouro = bancoCouro;
    }

    public double quantoCusta(){
        double valor = super.quantoCusta();
        if (tetoSolar){
            valor += 4800.0;
        }
        if (cambioAutomatico){
            valor += 3500.0;
        }
        if (bancoCouro){
            valor += 3000.0;
        }
        return valor;
    }

    public String toString(){
        String str = super.toString();
        if (tetoSolar){
            str += "\nTeto Solar: Sim";
        }
        if (cambioAutomatico){
            str += "\nCâmbio Automático: Sim";
        }
        if (bancoCouro){
            str += "\nBanco de Couro: Sim";
        }
        return str;
    }


}
