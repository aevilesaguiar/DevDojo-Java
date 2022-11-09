package academy.devdojo.maratonajava.javacore.Bintroducaometodos.exercicios.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;

    private double media;


    public void imprimirDados(){
        System.out.println("-------------------------------------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);

        if(salarios==null){
            return;
        }
        for (double salario:salarios
        ) {
            System.out.println("R$ "+ salario+ " ");
        }
        mediaSalario();
    }


    public void mediaSalario(){
        //se salário for nulo e quero que você não execute esse método , por isso p return
        if (salarios == null) {
            return;
        }


            for (double salariomedia : salarios
            ) {
                media = media + salariomedia;

            }
           media /= salarios.length;

        System.out.println("Média Salarial: R$"+media);

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }


}
