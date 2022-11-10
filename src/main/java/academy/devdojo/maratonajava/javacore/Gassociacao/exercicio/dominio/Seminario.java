package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio;

public class Seminario {
    private String titulo;
    private Aluno[] alunos;

    private Local local;

    private Professor professor;

    public Seminario(String titulo, Aluno[] alunos, Local local) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
    }

    public Seminario(String titulo, Aluno[] alunos, Local local, Professor professor) {
        this.titulo = titulo;
        this.alunos = alunos;
        this.local = local;
        this.professor = professor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
