

public class BalançoTrimestral {
	private double janeiro;
	private double fevereiro;
	private double marco;
	
	public BalançoTrimestral(double janeiro, double fevereiro, double marco) {
		this.janeiro = janeiro;
		this.fevereiro = fevereiro;
		this.marco = marco;
	}
	
	public double getJaneiro() {
		return janeiro;
	}
	
	public void setJaneiro(double janeiro) {
		this.janeiro = janeiro;
	}
	
	public double getFevereiro() {
		return fevereiro;
	}
	
	public void setFevereiro(double fevereiro) {
		this.fevereiro = fevereiro;
	}
	public double getMarco() {
		return marco;
	}
	
	public void setMarco (double marco) {
		this.marco = marco;
	}
	
	public double balancoGeral() {
		return janeiro+fevereiro+marco;
	}
}
