package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {

    //herança é um - herança você acopla muito o seu código
    //associação tem um - associação acopla um pouco menos


    protected String nome;
    protected String cpf;

    protected Endereco endereco;
    static {
        System.out.println("Dentro do bloco de inicialização estatico de pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização  de pessoa 1");
    }


    {
        System.out.println("Dentro do bloco de inicialização  de pessoa 2");
    }
    public Pessoa(String nome) {
        System.out.println("Dentro do Construtor de pessoa");
        this.nome = nome;
    }

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.cpf);
        System.out.println(this.endereco.getRua()+", "+endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
