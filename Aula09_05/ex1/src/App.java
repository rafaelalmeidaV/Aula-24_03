
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        Pessoa pessoa[] = new Pessoa[3];
        int op, numero,i;
        String nome, cpf;

        do{
            System.out.println("===MENU===");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Excluir");
            System.out.println("4 - Consultar ");
            System.out.println("5 - Imprimir");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            op = input.nextInt();

            switch(op){
                case 1:
                System.out.println("-----CADASTRAR-----");
                System.out.print("Nome: ");
                nome = input.next();
                System.out.print("Numero: ");
                numero = input.nextInt();
                System.out.print("CPF: ");
                cpf = input.next();
                i = 0;
                while(i < 3 && pessoa[i] != null){
                    i++;
                }
                if(i<3){
                    pessoa[i] = new Pessoa(	nome, numero, cpf);
                    System.out.println("Peessoa Cadastrada");

                }else{
                    System.out.println("Não há mais espaço para cadastro");
                }break;

                case 2:
                System.out.println("-----ALTERAR-----");
                System.out.print("Numero: ");
                numero = input.nextInt();
                i = 0;
                while(i < 3 && pessoa[i].getNumero() != numero){
                    i++;
                }
                if(i<3){
                    if(pessoa[i].getNumero() == numero){
                        System.out.print("Nome: ");
                        nome = input.next();
                        System.out.print("CPF: ");
                        cpf = input.next();
                        pessoa[i].setNome(nome);
                        pessoa[i].setCpf(cpf);
                        System.out.println("Peessoa Alterada");
                    }
                    


                }else{
                    System.out.println("Peessoa não encontrada");
                }break;

                case 3:
                System.out.println("-----EXCLUIR-----");
                System.out.print("Numero: ");
                numero = input.nextInt();
                i = 0;
                while(i < 3 && pessoa[i].getNumero() != numero){
                    i++;
                }
                if(i<3){
                    if(pessoa[i].getNumero() == numero){
                        pessoa[i] = null;
                        System.out.println("Peessoa Excluida");
                    }
                    
                }else{
                    System.out.println("Peessoa não encontrada");
                }break;

                case 4:
                System.out.println("-----CONSULTAR-----");
                System.out.print("Numero: ");
                numero = input.nextInt();
                i = 0;
                while(i<3 && pessoa[i].getNumero() != numero){
                    i++;
                }
                if(i<3){
                    if(pessoa[i].getNumero() == numero){
                        System.out.println(pessoa[i].toString());
                    }
                    
                }else{
                    System.out.println("Peessoa não encontrada");
                }break;

                case 5:
                System.out.println("-----IMPRIMIR-----");
                for(i=0; i<3; i++){
                    if(pessoa[i] != null){
                        System.out.println(pessoa[i].toString());
                    }
                }break;
            }
        }while(op != 0);

    
    }   
    
}
