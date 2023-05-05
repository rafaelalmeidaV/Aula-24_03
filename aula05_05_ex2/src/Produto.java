public class Produto {
    private int codigo;
    private String desc;
    private double preco;

    public Produto(int codigo, String desc, double preco) {
        this.codigo = codigo;
        this.desc = desc;
        this.preco = preco;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDesc() {
        return desc;
    }

    public double getPreco() {
        return preco;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void reajuste(double percentual) {
       this.preco = (this.preco * (percentual / 100)) + this.preco;
       

    }


}
