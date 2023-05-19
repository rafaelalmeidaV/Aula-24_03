public class Funcionario{
    private String nome;
    private double salario;
    private Empresa empregador;

    public Funcionario(String nome, double salario, Empresa empregador){
        this.nome = nome;
        this.salario = salario;
        this.empregador = empregador;

    }

    public String getNome(){
        return this.nome;
    }

    public double getSalario(){
        return this.salario;
    }

    public Empresa getEmpregador(){
        return this.empregador;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public void setEmpregador(Empresa empregador){
        this.empregador = empregador;
    }

    public void aumentaSalario(double aumento){
        this.salario += aumento;
    }

    public double getGanhoAnual(){
        return this.salario * 12;
    }

    public String toString(){
        return "Nome: " + this.nome + "\nSalario: " + this.salario + "\nEmpregador: " + this.empregador.getNome();
    }
}