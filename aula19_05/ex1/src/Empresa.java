public class Empresa {
    private String nome;
    private String endereco;

    public Empresa(String nome, String endereco){
        this.nome=nome;
        this.endereco=endereco;
    }

    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setEndereco(String endereco){
        this.endereco=endereco;
    }

    public String toString(){
        return "Nome: " + this.nome + "\nEndereco: " + this.endereco;
    }


    

}
