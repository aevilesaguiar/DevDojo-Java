package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;

    //bloco de inicialização de instância, por que ele é executado todas as vezes que esse objeto é criado
    //a regra é que ele é criado antes do construtor, independente de quantos objetos nós criarmos ele sempre
    //será executado
    {
        System.out.println("Dentro do bloco de inicialização de instancia");
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i]=i+1;
        }
    }

    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {



        for (int list: episodios
             ) {
            System.out.print(list+" ");
        }
        System.out.println();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodios() {
        return episodios;
    }

    public void setEpisodios(int[] episodios) {
        this.episodios = episodios;
    }
}
