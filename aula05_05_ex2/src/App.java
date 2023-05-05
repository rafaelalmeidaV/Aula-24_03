import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Produto[] produtos = new Produto[1];
        Scanner leitor = new Scanner(System.in);

        int codigo;
        String desc;
        double preco;
        double percentual;

        for(int i = 0; i < produtos.length; i++) {
            System.out.println("Digite o código do produto: ");
            codigo = leitor.nextInt();
            System.out.println("Digite a descrição do produto: ");
            desc = leitor.next();
            System.out.println("Digite o preço do produto: ");
            preco = leitor.nextDouble(); 

            produtos[i] = new Produto(codigo, desc, preco);

            System.out.println("Digite a porcentagem de reajuste: ");
            percentual = leitor.nextDouble();
            produtos[i].reajuste(percentual);
            
        }

        for(Produto f: produtos) {
            System.out.println(f.getCodigo());
            System.out.println(f.getDesc());
            System.out.println(f.getPreco());
        }


    }

    
}
