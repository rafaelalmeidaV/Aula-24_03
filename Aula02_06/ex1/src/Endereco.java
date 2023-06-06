public class Endereco {
    private String rua;
    private String cep;
    private String cidade;

    public Endereco(String rua, String cep, String cidade){
        this.rua = rua;
        this.cep = cep;
        this.cidade = cidade;
    }

    public String getRua(){
        return this.rua;
    }

    public String getCep(){
        return this.cep;
    }

    public String getCidade(){
        return this.cidade;
    }

    public void setRua(String rua){
        this.rua = rua;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String ToString(){
        return "rua" + this.rua + "cep" + this.cep + "cidade" + this.cidade ;
    }


}
