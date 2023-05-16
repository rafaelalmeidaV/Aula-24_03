import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        CriaConta conta1[] = new CriaConta[2];

        String nome, numConta;
        double saldo;
        int op,i,qtd;

        do { 
            System.out.println("------MENU DE OPÇÕES------");
            System.out.println("1 - Criar conta");
            System.out.println("2 - Alterar Conta");
            System.out.println("3 - Excluir Conta");
            System.out.println("4 - Imprimir Conta");
            System.out.println("5 - Depositar");
            System.out.println("6 - Sacar");
            System.out.println("7 - Consultar Saldo");
            System.out.println("8 - Sair");

            op = sc.nextInt();

            switch(op){
                case 1: 
                        sc.nextLine();
                        System.out.println("Nome");
                        nome = sc.nextLine();
                        System.out.println("numero conta");
                        numConta = sc.nextLine();
                        System.out.println("Saldo");
                        saldo = sc.nextDouble();
                        i = 0;

                        while(i < 2 && conta1[i] != null){
                            i++;
                        }
                        
                        if(i<3){
                            System.out.println("conta cadastrada com sucesso");
                        }else{
                            System.out.println("cadastro lotado");
                        }break;
                        
                
                case 2:
                        sc.nextLine();
                        System.out.println("Digie o nome que deseja alterar");
                        nome = sc.next();
                        i = 0;
                        while(i < 3 && conta1[i] != null ){

                            if(conta1[i].getNome().equals(nome)){
                                System.out.println("Digite o novo nome");
                                nome = sc.next();
                                conta1[i].setNome(nome);
                                System.out.println("Nome alterado com sucesso");
                            }
                            i++;
                        }

            }

        }while(op != 8);
    }
}
