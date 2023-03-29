public class App {
    public static void main(String[] args) throws Exception {
        
        PessoaFisica pessoa1 = new PessoaFisica();
        pessoa1.setNome("kkkkk");
        pessoa1.setRg("12313414-5");
        System.out.println(pessoa1.getNome());
        System.out.println(pessoa1.getRg());

        Funcionario func1 = new Funcionario();
        func1.setNome("kakakaak");
        func1.setRg("347267432");
        func1.setCartao(765);
        System.out.println("\n"+func1.getNome());
        System.out.println("\n"+func1.getRg());
        System.out.println("\n"+func1.getCartao());
    }
}
