public class Funcionario {
    
    private String nome;
    private int cpf;
    private double salario;
    private int HorasTrabalhadas;

    public Funcionario (String nome, int cpf, double salario, int HorasTrabalhadas){
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
        this.HorasTrabalhadas = HorasTrabalhadas;

    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getHorasTrabalhadas() {
        return HorasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        HorasTrabalhadas = horasTrabalhadas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    


}
