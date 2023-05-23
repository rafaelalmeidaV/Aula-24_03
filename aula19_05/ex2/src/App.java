import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        final int vet_pessoas = 3;
        final int vet_contas = 3;

        Pessoa[] pessoas = new Pessoa[vet_pessoas];
        Conta[] contas = new Conta[vet_contas];

        //declaração de variaveis 
        int op, op2,cpf,i;
        String nome,rg;

        do{
            System.out.println("\n\n==[Menu Principal]==");
            System.out.println("1 - Pessoa");
            System.out.println("2 - Conta");
            System.out.println("3 - Sair");

            System.out.println("Digite a opção desejada: ");
            op = sc.nextInt();

            switch(op){
                case 1:
                    do {
                        System.out.println("\n\n==[Pessoa]==");
                        System.out.println("1 - Cadastrar");
                        System.out.println("2 - Alterar");
                        System.out.println("3 - Excluir");
                        System.out.println("4 - Consultar");
                        System.out.println("5 - Imprimir");
                        System.out.println("6 - Sair");

                        System.out.println("Digite a opção desejada: ");
                        op2 = sc.nextInt();

                        switch(op2){
                            case 1:
                                System.out.println("\n\n==[Cadastrar Pessoa]==");
                                System.out.println("Digite o nome: ");
                                nome = sc.nextLine();
                                sc.nextLine();
                                System.out.println("Digite o CPF: ");
                                cpf = sc.nextInt();
                                System.out.println("Digite o RG: ");
                                rg = sc.nextLine();
                                sc.nextLine();

                                i=0;

                                while(i<vet_pessoas && pessoas[i]!=null){
                                    i++;
                                }

                                if(i<vet_pessoas){
                                    pessoas[i] = new Pessoa(nome, cpf, rg);
                                    System.out.println("Pessoa cadastrada com sucesso!");

                                }else{
                                    System.out.println("Não foi possivel cadastrar a pessoa!");
                                }break;

                            case 2:
                                System.out.println("\n\n==[Alterar Pessoa]==");
                                System.out.println("Digite o CPF da pessoa que deseja alterar: ");
                                cpf = sc.nextInt();

                                i=0;

                                while(i<vet_pessoas && pessoas[i].getCPF()!=cpf){
                                    i++;
                                }

                                if(i<vet_pessoas){
                                    System.out.println("Digite o nome: ");
                                    nome = sc.nextLine();
                                    sc.nextLine();
                                    System.out.println("Digite o RG: ");
                                    rg = sc.nextLine();

                                    pessoas[i].setNome(nome);
                                    pessoas[i].setRg(rg);

                                    System.out.println("Pessoa alterada com sucesso!");

                                }else{
                                    System.out.println("Não foi possivel alterar a pessoa!");
                                }break;

                            case 3:
                                System.out.println("\n\n==[Excluir Pessoa]==");
                                System.out.println("Digite o CPF da pessoa que deseja excluir: ");
                                cpf = sc.nextInt();

                                i=0;

                                while(i<vet_pessoas && pessoas[i].getCPF()!=cpf){
                                    i++;
                                }

                                if(i<vet_pessoas){
                                    pessoas[i] = null;
                                    System.out.println("Pessoa excluida com sucesso!");

                                }else{
                                    System.out.println("Não foi possivel excluir a pessoa!");
                                }break;

                            case 4:
                                System.out.println("\n\n==[Consultar Pessoa]==");
                                System.out.println("Digite o CPF da pessoa que deseja consultar: ");
                                cpf = sc.nextInt();

                                i=0;

                                while(i<vet_pessoas && pessoas[i].getCPF()!=cpf){
                                    i++;
                                }

                                if(i<vet_pessoas){
                                    System.out.println("Nome: "+pessoas[i].getNome());
                                    System.out.println("CPF: "+pessoas[i].getCPF());
                                    System.out.println("RG: "+pessoas[i].getRg());

                                }else{
                                    System.out.println("Não foi possivel consultar a pessoa!");
                                }break;

                            case 5:
                                System.out.println("\n\n==[Imprimir Pessoa]==");
                                System.out.println("Digite o CPF da pessoa que deseja imprimir: ");
                                cpf = sc.nextInt();

                                i=0;

                                while(i<vet_pessoas && pessoas[i].getCPF()!=cpf){
                                    i++;
                                }

                                if(i<vet_pessoas){
                                    System.out.println(pessoas[i].toString());

                                }else{
                                    System.out.println("Não foi possivel imprimir a pessoa!");
                                }break;

                            case 6:
                                System.out.println("Saindo do menu Pessoa...");
                                break;


                    }
            }while(op2!=6);

        }


        }while(op!=3);
    }
}
