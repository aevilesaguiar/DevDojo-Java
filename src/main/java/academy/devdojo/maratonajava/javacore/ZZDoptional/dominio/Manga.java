package academy.devdojo.maratonajava.javacore.ZZDoptional.dominio;

public class Manga {

    private Integer id;//usado Integer por que se eu quiser usar o equals ele vai me possibilitar por ser uma Classe Wrapper
    private String title;
    private  int chapters;

    public Manga(Integer id, String title, int chapters) {
        this.id = id;
        this.title = title;
        this.chapters = chapters;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", chapters=" + chapters +
                '}';
    }
}
