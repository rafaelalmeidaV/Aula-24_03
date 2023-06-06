public class Cliente {
    private String cpf;
    private String nome;
    private Endereco end;
    private String complemento;
    private int numero;

    public Cliente(String cpf, String nome, Endereco end, String complemento, int numero){
        this.cpf = cpf;
        this.nome = nome;
        this.end = end;
        this.complemento = complemento;
        this.numero = numero;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getNome(){
        return this.nome;
    }

    public Endereco getEnd(){
        return this.end;
    }

    public String getComplemento(){
        return this.complemento;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEnd(Endereco end){
        this.end = end;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public String ToString(){
        return "cpf" + this.cpf + "nome" + this.nome + "endereco" + this.end + "complemento" + this.complemento + "numero" +this.numero ;
    }

    
}
