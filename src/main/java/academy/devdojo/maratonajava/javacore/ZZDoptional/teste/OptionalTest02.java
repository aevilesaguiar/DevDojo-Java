package academy.devdojo.maratonajava.javacore.ZZDoptional.teste;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repository.MangaRepository;

import java.util.List;
import java.util.Optional;

public class OptionalTest02 {

    public static void main(String[] args) {

        //programação funcional com Optional

        //só instancie por instancias, pois não precisa, pois os métodos são estaticos
        //MangaRepository mangaRepository= new MangaRepository();


        //buscar por titulo, se existir alterar
        Optional<Manga> mangaByTitle =MangaRepository.findByTitle("Boku no Hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);


        //orElse->If a value is present, returns the value, otherwise throws an exception produced by the exception supplying function.
        //Se um valor estiver presente, retorna o valor, caso contrário, lança uma exceção produzida pela função de fornecimento de exceção.
        //o orElse ele extrai o Objeto do Optinal

        //buscar por is, se o id não existir lança uma exceção
        MangaRepository.findByID(2)
                .orElseThrow(IllegalArgumentException::new);


        //caso não exista pelo o título criar o titulo, criar um novo mangá

        Manga newManga = MangaRepository.findByTitle("Driftres")
                .orElse(new Manga(4,"Driftters",30));
        System.out.println(newManga);






    }

}
