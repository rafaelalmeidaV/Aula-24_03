import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        Funcionario funcionario = new Funcionario();
        funcionario.nome = "João";
        funcionario.cargo = "Programador";
        funcionario.salario = 1000;
        
        System.out.println(funcionario.nome);
        System.out.println(funcionario.cargo);
        System.out.println(funcionario.salario);
        System.out.println("Digite o valor da hora extra: ");   
        double horaExtra = sc.nextDouble();
        
        double salarioComHoraExtra = funcionario.calcularSalario(funcionario.salario, horaExtra);
        System.out.println(salarioComHoraExtra);
    }
}
