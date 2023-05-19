public class App {
    public static void main(String[] args) throws Exception {
        Empresa emp = new Empresa("Soft & Ware", "Rua dos Bobos, 0");

        Funcionario[] funcionarios = new Funcionario[2];

        funcionarios[0] = new Funcionario("Rafael", 3600, emp);

        funcionarios[1] = new Funcionario("Joao", 3600, emp);
    }
}
