public class Graduaçao extends Alunos{
    
    private int anoCurso;

    public Graduaçao(String nome, int RA, String curso, int anoCurso){
        super(nome,RA,curso );
        this.anoCurso = anoCurso;
    }

    public int getAnoCurso(){
        return anoCurso;
    }

    public void setAnoCurso(int anoCurso){
        this.anoCurso = anoCurso;
    }
}
