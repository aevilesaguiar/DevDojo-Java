package academy.devdojo.maratonajava.javacore.Xserelializacao.dominio;

import java.io.*;

public class Aluno implements Serializable {

    @Serial
    private static final long serialVersionUID = 7027803336652709644L;
    private Long id;
    private String nome;
    private transient String password; //foi ignorado devido o transient
    private final static String NOME_ESCOLA ="Dev Dojo";

    private transient Turma turma;

    public Aluno() {
    }

    public Aluno(Long id, String nome, String password) {
        System.out.println("dentro do construtor");
        this.id = id;
        this.nome = nome;
        this.password = password;

    }
@Serial
    private  void writeObjet(ObjectOutputStream oos)  {
        try {
            oos.defaultWriteObject();
            oos.writeUTF(turma.getNome());
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    @Serial
    private  void readObjet(ObjectInputStream ois)  {
        try {
            ois.defaultReadObject();
            String nomeTurma= ois.readUTF();
            turma= new Turma(nomeTurma);

        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", password='" + password + '\'' +
                ", nomeEscola="+ NOME_ESCOLA +
                ", turma="+turma+
                '}';
    }


}
