public class Vip extends Ingressos{
	private int numCadeira;
	private boolean garrafaVodka;
	
	public Vip(String diaSgow, String nomeCantor, double precoIngresso, String bebidaEscolhida, int numCadeira,
	boolean garrafaVodka) {
		
		super(diaSgow, nomeCantor, precoIngresso, bebidaEscolhida);
		this.numCadeira = numCadeira;
		this.garrafaVodka = garrafaVodka;
	}

	public int getNumCadeira() {
		return numCadeira;
	}

	public void setNumCadeira(int numCadeira) {
		this.numCadeira = numCadeira;
	}

	public boolean getGarrafaVodka() {
		return garrafaVodka;
	}

	public void setGarrafaVodka(boolean garrafaVodka) {
		this.garrafaVodka = garrafaVodka;
	}
	
	@Override
	public void calcularPreco(double precoIngresso, double valorBebida) {
		double soma = precoIngresso + valorBebida;
		System.out.println("O valor total do Ingresso: "+ soma);
	}
	
}
