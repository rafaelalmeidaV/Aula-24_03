

public class ContaDemo {
        
        public static void main(String [] args){
            Conta conta1, conta2;

            conta1 = new Conta("643723 - X");
            conta2 = new Conta("874387-X");

            System.out.println("conta1: " + conta1.getNumeroConta() + "id" + conta1.getidConta());
            System.out.println("conta2: " + conta2.getNumeroConta() + "id" + conta2.getidConta());

            System.out.println("ultimoID"+ Conta.getUltimoID());
        }

    }
