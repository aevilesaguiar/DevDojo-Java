package academy.devdojo.maratonajava.javacore.Fmodificadoresestatico.domain;

public class Anime {
    private String nome;
    private static int[] episodios;

    /**
     * 0 - Bloco de inicialização é ejecutado quando a JVM carregar a class
     * 1 -Aloca espaço em memória para o objeto
     * 2- Cada atributo de classe é criado e inicializado com valores default(null para objeto e 0 para numerais e false para boolean)
     * ou o que dor passado no atributo;
     * 3 -Bloco de inicialização é executado
     * 4 - Construtor é executado*/

    //bloco de inicialização estatico


    static  {
        System.out.println("Dentro do bloco de inicialização de instancia");
        episodios = new int[100];

        for (int i = 0; i < episodios.length; i++) {
            episodios[i]=i+1;
        }
    }

    static  {
        System.out.println("Bloco estático");

    }

  {
        System.out.println("Bloco não estático");

    }


    public Anime(String nome) {
        this.nome = nome;
    }

    public Anime() {



        for (int list: Anime.episodios
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
