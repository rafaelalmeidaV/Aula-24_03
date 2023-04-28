public class App {
    public static void main(String[] args) throws Exception {
       Automovel a1 = new Automovel("Gasolina", "Fusca", "Azul");
       AutomovelBasico a2 = new AutomovelBasico("Gasolina", "Fusca", "Azul", true, true, true);
       AutomovelLuxo a3 = new AutomovelLuxo("Gasolina", "Fusca", "Azul", true, true, true);
        
        
        System.out.println(a1);
        System.out.println(a2);
        System.out.println(a3);

        System.out.println(a1.quantoCusta());
        System.out.println(a2.quantoCusta());
        System.out.println(a3.quantoCusta());


    }
}
