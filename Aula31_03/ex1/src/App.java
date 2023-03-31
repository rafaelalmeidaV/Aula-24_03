public class App {
    public static void main(String[] args) throws Exception {
        
       AlunoPósGraduação aluno1 = new AlunoPósGraduação("João", 123456, "Engenharia", "Desenvolvimento de Software");
            System.out.println("Nome: " + aluno1.getNome());
            System.out.println("RA: " + aluno1.getRA());
            System.out.println("Curso: " + aluno1.getCurso());
            System.out.println("Área de Pesquisa: " + aluno1.getAreaDePesquisa());
        
        Graduaçao aluno2 = new Graduaçao("Rafael", 654321, "Engenharia", 2021);
            System.out.println("Nome: " + aluno2.getNome());
            System.out.println("RA: " + aluno2.getRA());
            System.out.println("Curso: " + aluno2.getCurso());
            System.out.println("Ano do Curso: " + aluno2.getAnoCurso());
    }
}
