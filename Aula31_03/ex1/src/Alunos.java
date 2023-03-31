public class Alunos {
    
    private String nome;
    private int RA;
    private String curso;

    public Alunos(String nome, int RA, String curso){
        this.nome = nome;
        this.RA = RA;
        this.curso = curso;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getRA(){
        return RA;
    }

    public void setRA(int RA){
        this.RA = RA;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }
}