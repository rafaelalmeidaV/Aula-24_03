

public class ContaDemo {
        
        public static void main(String [] args){
            

            Conta conta1 = new Conta("643723 - X", 123, 0);
            Conta conta2 = new Conta("874387-X", 987, 0);

            System.out.println("conta1: " + conta1.getNumeroConta() + " id " + conta1.getidConta()+" saldo "+conta1.getSaldo());
            System.out.println("conta2: " + conta2.getNumeroConta() + " id " + conta2.getidConta());

            System.out.println("ultimoID "+ Conta.getUltimoID());
        }

    }

