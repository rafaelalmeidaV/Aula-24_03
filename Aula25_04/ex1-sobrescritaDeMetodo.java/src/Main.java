import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Double valorIngresso;
		String bebida = null;
		double valorBebida = 0;
		
		System.out.println("Casa de Show  Sp");
		System.out.println("============================================");
		
		System.out.print("Dia do Show? ");
		String diaShow = sc.nextLine();
		
		System.out.println("Ingresso: 1-Comum ou 2-Vip?");
		Integer ingresso = sc.nextInt();
		
		System.out.print("Valor do Ingresso: ");
		valorIngresso = sc.nextDouble();
		
		if(ingresso == 2) {
			
			System.out.println("Adicionar bebida a sua compra:");
			System.out.println("0 - Não vai beber!");
			System.out.println("1 - chopp R$ 10,00");
			System.out.println("2 - caipirinha R$ 18,00");
			System.out.println("3 - Garrafa de Vodka R$ 100,00");
			int addBebida = sc.nextInt();
			
			if(addBebida == 1) {
				bebida = "Chopp";
				valorBebida = 10.00;
			}else if(addBebida == 2) {
				bebida = "Caipirinha";
				valorBebida = 18.00;
			}
			else if(addBebida == 3) {
				bebida = "Vodka";
				valorBebida = 100.00;
			}
			else {
				bebida = "Não vai beber!";
			}
			
			System.out.print("Numero de caideras que deseja reservar? ");
			int cadeiras = sc.nextInt();
			
			Vip vip = new Vip(diaShow,"Bruno Barreto", valorIngresso, bebida, cadeiras, true);

			vip.calcularPreco(valorIngresso, valorBebida);

			System.out.println(vip.getDiaSgow()+" " +" "+ vip.getNomeCantor()+" " + vip.getBebidaEscolhida() +" "+ vip.getGarrafaVodka());

			System.out.println("");
		}
		else if(ingresso == 1) {
			
			System.out.println("Adicionar bebida a sua compra:");
			System.out.println("0 - Não vai beber!");
			System.out.println("1 - chopp R$ 10,00");
			System.out.println("2 - caipirinha R$ 18,00");
			int addBebida = sc.nextInt();
			
			if(addBebida == 1) {
				bebida = "Chopp";
				valorBebida = 10.00;
			}else if(addBebida == 2) {
				bebida = "Caipirinha";
				valorBebida = 18.00;
			}else {
				bebida = "Não vai beber!";
			}
		
			Ingressos comum = new Ingressos(diaShow, "Matue", valorIngresso , bebida);

			comum.calcularPreco(valorIngresso, valorBebida);
			
			System.out.println(comum.getDiaSgow()+" " +" "+ comum.getNomeCantor()+" " + " "+comum.getPrecoIngresso() +" "+ comum.getBebidaEscolhida());
		
		}

		System.out.println("============================================");

	}

}
