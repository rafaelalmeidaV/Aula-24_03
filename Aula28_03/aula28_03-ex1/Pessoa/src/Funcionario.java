public class Funcionario extends PessoaFisica {
    
    private int cartao;

    public Funcionario(String noma, int rg, int cpf) {
        
    }

    public int getCartao(){
        return cartao;
    }

    public void setCartao(int cartao){
        this.cartao=cartao;
    }
}
