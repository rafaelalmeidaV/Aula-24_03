import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        final int pos_cliente = 3;
        int pos_endereco = 3;

        Cliente[] cliente = new Cliente[pos_cliente];
        Endereco[] endereco = new Endereco[pos_endereco];

        int op, op2, numero = 0, i, a, qtdEndereco = 2;
        String nome = null, cpf = null, complemento = null, cep = null, rua = null, cidade = null;

        do {
            System.out.println("Escolha uma alternativa");
            System.out.println("1 - Cliente");
            System.out.println("2 - Endereço");
            System.out.println("3-Sair");

            op = sc.nextInt();

            switch (op) {
                case 1:

                    do {
                        System.out.println("digite oque deseja fazer com o cliente");
                        System.out.println("1- Cadastrar");
                        System.out.println("2- Alterar");
                        System.out.println("3- Exluir");
                        System.out.println("4 - Imprimir");
                        System.out.println("5- sair");

                        op2 = sc.nextInt();

                        switch (op2) {
                            case 1:
                                if (qtdEndereco > 0) {
                                    System.out.println("digite o nome");
                                    nome = sc.next();
                                    System.out.println("digite o cpf");
                                    cpf = sc.next();
                                    System.out.println("complemento");
                                    complemento = sc.next();
                                    System.out.println("numero");
                                    numero = sc.nextInt();
                                    System.out.println("digite o CEP");
                                    cep = sc.next();
                                    // ao cadastrar o cliente devera buscar o endereço pelo cep
                                    i = 0;
                                    while (i < pos_cliente && cliente[i] != null) {
                                        i++;
                                    }

                                    if (i < 3) {
                                        cliente[i] = new Cliente(nome, cpf, endereco[i], complemento, numero);
                                        System.out.println("Cliente cadastrado com sucesso");
                                    } else {
                                        System.out.println("Não foi possivel cadastrar o cliente");
                                        break;

                                    }

                                    

                                }else
                                break;

                            case 2:
                                if(qtdEndereco>0){
                                    System.out.println("digite o cpf do cliente que deseja alterar");
                                    cpf = sc.next();
                                    
                                    i = 0;
                                    while(i < 3 && cliente[i].getCpf() != cpf){

                                        i++;
                                    }
                                    if(i<3){
                                        if(cliente[i].getCpf()== cpf){
                                            nome = sc.next();
                                            complemento = sc.next();
                                            numero = sc.nextInt();
                                            cliente[i].setNome(nome);
                                            cliente[i].setComplemento(complemento);
                                            cliente[i].setNumero(numero);
                                        }
                                        

                                    }

                                    break;

                                }
                            
                            case 3:
                                if(qtdEndereco>0){
                                    System.out.println("digite o cpf que deseja alterar");
                                    cpf = sc.next();

                                    i=0;
                                    while(i< pos_cliente && cliente[i].getCpf() != cpf){
                                        i++;
                                    }

                                    if(i<3){
                                        if(cliente[i].getCpf() == cpf){
                                            cliente[i] = null;
                                            
                                        }

                                    }

                                }
                            case 4:
                                if(qtdEndereco>0){
                                    
                                }

                                   
                        }

                    } while (op2 != 5);

                     
            }
            
        } while (op != 3);

    }
}
