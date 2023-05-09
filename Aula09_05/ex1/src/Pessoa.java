public class Pessoa {
    private String nome;
    private int numero;
    private String cpf;

    public Pessoa(String nome, int numero, String cpf) {
        this.nome = nome;
        this.numero = numero;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String toString() {
        return "Nome: " + this.nome + "\nNumero: " + this.numero + "\nCPF: " + this.cpf;
    }
}
