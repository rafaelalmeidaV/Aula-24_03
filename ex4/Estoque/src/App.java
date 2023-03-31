import java.util.Scanner;

import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        Produto prod1 = new Produto("TV", 900.00, 10);

        System.out.println("Produto 1 " + prod1.getNome() +" "+ prod1.getPreco() +" " + prod1.getEstoque() +" " + prod1.somaEstoque());

        System.out.println("Type the quantity add in stock");
        int estoque = sc.nextInt();
        prod1.addEstoque(estoque);
        
        System.out.println("Produto 1 "
         + prod1.getNome() +
        " "+ prod1.getPreco() +
        " " + prod1.getEstoque() +
        " " + prod1.somaEstoque());

        System.out.println("Type a quantity that you whant to remove in Stock: ");
        estoque = sc.nextInt();
        prod1.removeEstoque(estoque);

        System.out.println("Produto 1 "
         + prod1.getNome() +
        " "+ prod1.getPreco() +
        " " + prod1.getEstoque() +
        " " + prod1.somaEstoque());

    }
}
