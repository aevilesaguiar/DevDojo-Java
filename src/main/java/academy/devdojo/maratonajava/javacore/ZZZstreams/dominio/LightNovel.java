package academy.devdojo.maratonajava.javacore.ZZZstreams.dominio;

//ligth novelsão os livros que dão origem aos animes
public class LightNovel {
    private String title;
    private double price;

    private int episodies;

    public LightNovel(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public LightNovel(String title, double price, int episodies) {
        this.title = title;
        this.price = price;
        this.episodies = episodies;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getEpisodies() {
        return episodies;
    }

    public void setEpisodies(int episodies) {
        this.episodies = episodies;
    }

    @Override
    public String toString() {
        return "LightNovel{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", episodies=" + episodies +
                '}';
    }


}
