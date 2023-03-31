public class AlunoPósGraduação extends Alunos {
    
    private String areaDePesquisa;

    public AlunoPósGraduação(String nome, int RA, String curso,  String areaDePesquisa){
        super(nome,RA,curso);
        this.areaDePesquisa = areaDePesquisa;
    }
     
    public String getAreaDePesquisa(){
        return areaDePesquisa;
    }

    public void setAreaDePesquisa(String areaDePesquisa){
        this.areaDePesquisa = areaDePesquisa;
    }
}
