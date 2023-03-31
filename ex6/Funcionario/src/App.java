import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        Funcionario func1 = new Funcionario("rafael", 6000, 1000);

        System.out.println("func1 " + func1.getNome()+ ", " +func1.salarioLiquido());

        System.out.println("Digite a taxa de aumento do salario do funcionario: ");
        double porc = sc.nextDouble();
        func1.porcSalario(porc);

        System.out.println("func1 " + func1.getNome()+ ", " +func1.getSalarioBruto());

    }
}
