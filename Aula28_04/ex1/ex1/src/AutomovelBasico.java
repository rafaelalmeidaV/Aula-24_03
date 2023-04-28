public class AutomovelBasico extends Automovel {

    private boolean vidrosEletricos;
    private boolean bancoRegulagemAltura;
    private boolean sensorEstacionamento;
    
    public AutomovelBasico(String combustivel, String modelo, String cor, boolean vidrosEletricos, boolean bancoRegulagemAltura, boolean sensorEstacionamento) {

        super(combustivel, modelo, cor);
        this.vidrosEletricos = vidrosEletricos;
        this.bancoRegulagemAltura = bancoRegulagemAltura;
        this.sensorEstacionamento = sensorEstacionamento;

    } 

    public boolean getVidrosEletricos() {
        return vidrosEletricos;
    }

    public boolean getBancoRegulagemAltura() {
        return bancoRegulagemAltura;
    }

    public boolean getSensorEstacionamento() {
        return sensorEstacionamento;
    }

    public void setVidrosEletricos(boolean vidrosEletricos) {
        this.vidrosEletricos = vidrosEletricos;
    }

    public void setBancoRegulagemAltura(boolean bancoRegulagemAltura) {
        this.bancoRegulagemAltura = bancoRegulagemAltura;
    }

    public void setSensorEstacionamento(boolean sensorEstacionamento) {
        this.sensorEstacionamento = sensorEstacionamento;
    }     


    public double quantoCusta(){
        double valor = super.quantoCusta();
        if (vidrosEletricos){
            valor += 2200.0;          
        }
        if (bancoRegulagemAltura){
            valor += 1380.0;
        }
        if (sensorEstacionamento){
            valor += 1812.0;
        }
        return valor;
    }

    public String toString(){
        String str = super.toString();
        if (vidrosEletricos){
            str += "\nVidros Elétricos: Sim";
        } 
        if (bancoRegulagemAltura){
            str += "\nBanco com Regulagem de Altura: Sim";
        }
        if (sensorEstacionamento){
            str += "\nSensor de Estacionamento: Sim";
        }
        return str;

    }  
    

    
}
