import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
        Funcionario[] funcionarios = new Funcionario[10];
        Scanner sc = new Scanner(System.in);
        int num;
        String nome, cargo;
        double salario;

        for(int i=0;i<10;i++){
            System.out.println("Digite o número do funcionário: ");
            num = sc.nextInt();
            sc.nextLine();
            System.out.println("Digite o nome do funcionário: ");
            nome = sc.nextLine();
            System.out.println("Digite o cargo do funcionário: ");
            cargo = sc.nextLine();
            System.out.println("Digite o salário do funcionário: ");
            salario = sc.nextDouble();
            sc.nextLine();
            funcionarios[i] = new Funcionario(num, nome, cargo, salario);
        }

        for(Funcionario f: funcionarios){
            System.out.println("Número: " + f.getNum());
            System.out.println("Nome: " + f.getNome());
            System.out.println("Cargo: " + f.getCargo());
            System.out.println("Salário: " + f.getSalario());
            

        }
    }
}
