public class Pessoa {
    private String nome;
    private int CPF;
    private String rg;

    public Pessoa(String nome, int CPF, String rg) {
        this.nome = nome;
        this.CPF = CPF;
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public int getCPF() {
        return CPF;
    }


    public String getRg() {
        return rg;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    
    public String toString(){
        return "Nome: " + this.nome + " CPF: " + this.CPF + " RG: " + this.rg;
    }



}
