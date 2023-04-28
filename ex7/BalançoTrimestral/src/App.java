import java.util.Scanner;
public class App {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor de janeiro: ");
        double janeiro = sc.nextDouble();

        System.out.println("Digite o valor de fevereiro: ");
        double fevereiro = sc.nextDouble();

        System.out.println("Digite o valor de marco: ");
        double marco = sc.nextDouble();

		
		BalançoTrimestral t1 = new BalançoTrimestral(janeiro,fevereiro,marco);

        System.out.println("O balanço geral é: " + t1.balancoGeral());
		
		
	}

}
