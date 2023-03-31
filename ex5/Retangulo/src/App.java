import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        Retangulo ret1 = new Retangulo();

        System.out.print("digite a altura do seu retangulo: ");
        double altura = sc.nextDouble();
        ret1.setAltura(altura);

        System.out.println();
        System.out.print("digite a altura do seu retangulo: ");
        double largura = sc.nextDouble();
        ret1.setLargura(largura);

        System.out.println("Area "+ ret1.calcArea()+
        "Perimetro " + ret1.calcPerimetro()+ 
        "Diagonal " + ret1.calcDiagonal()
        );

    }
}
