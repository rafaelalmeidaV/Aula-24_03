public class Funcionario {
    private int num;
    private String nome, cargo;
    private double salario;

    public Funcionario (int num, String nome, String cargo, double salario) {
        this.num = num;
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getNum () {
        return num;
    }

    public String getNome () {
        return nome;
    }

    public String getCargo () {
        return cargo;
    }

    public double getSalario () {
        return salario;
    }

    public void setNum (int num) {
        this.num = num;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setCargo (String cargo) {
        this.cargo = cargo;
    }

    public void setSalario (double salario) {
        this.salario = salario;
    }

    

}
