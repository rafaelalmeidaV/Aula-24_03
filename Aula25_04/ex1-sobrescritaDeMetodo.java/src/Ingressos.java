
public class Ingressos {
	private String diaSgow;
	private String nomeCantor;
	private double precoIngresso;
	private String bebidaEscolhida;
	
	public Ingressos(String diaSgow, String nomeCantor, double precoIngresso, String bebidaEscolhida) {
		super();
		this.diaSgow = diaSgow;
		this.nomeCantor = nomeCantor;
		this.precoIngresso = precoIngresso;
		this.bebidaEscolhida = bebidaEscolhida;
	}

	public String getDiaSgow() {
		return diaSgow;
	}

	public void setDiaSgow(String diaSgow) {
		this.diaSgow = diaSgow;
	}

	public String getNomeCantor() {
		return nomeCantor;
	}

	public void setNomeCantor(String nomeCantor) {
		this.nomeCantor = nomeCantor;
	}

	public double getPrecoIngresso() {
		return precoIngresso;
	}

	public void setPrecoIngresso(double precoIngresso) {
		this.precoIngresso = precoIngresso;
	}

	public String getBebidaEscolhida() {
		return bebidaEscolhida;
	}

	public void setBebidaEscolhida(String bebidaEscolhida) {
		this.bebidaEscolhida = bebidaEscolhida;
	}
	
	
	public void calcularPreco(double precoIngresso, double valorBebida ) {
		double soma = precoIngresso + valorBebida;
		System.out.println("O valor total do Ingresso: "+ soma);
	}
}