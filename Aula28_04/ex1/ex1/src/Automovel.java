public class Automovel {
    private String combustivel;
    private String modelo;
    private String cor;

    public Automovel(String combustivel, String modelo, String cor) {
        this.combustivel = combustivel;
        this.modelo = modelo;
        this.cor = cor;
    }

    public Automovel(String combustivel){
        this.combustivel = combustivel;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String toString(){
        String str =  "Combustível: " + this.combustivel + "\nModelo: " + this.modelo + "\nCor: " + this.cor;
        return str;
    }

    public double quantoCusta(){
        return 50000.0;
    }
}
