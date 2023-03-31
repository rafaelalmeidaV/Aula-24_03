public class Retangulo {
    private double altura;
    private double largura;

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getLargura(){
        return largura;
    }

    public void setLargura(double largura){
        this.largura=largura;
    }

    public double calcArea(){
        return altura * largura;
    }

    public double calcPerimetro(){
        return 2 * (altura + largura);
    }

    public double calcDiagonal(){
        return Math. sqrt(altura*altura + largura*largura); 
    }
}
