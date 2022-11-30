package academy.devdojo.maratonajava.javacore.ZZDoptional.repository;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class MangaRepository {

    //simulando o Banco de dados
    private static List<Manga> mangas=new ArrayList<>(List.of(new Manga(1,"Boku no Hero",50),new Manga(2,"Overload",20)));


    //forma não funcional
/*
      public   static Optional<Manga> findByTitle(String title){
        Manga found = null;
        for (Manga manga:mangas
             ) {
            if(manga.getTitle().equals(title)){
                found=manga;
            }
        }
       return Optional.ofNullable(found);
    }


      public   static Optional<Manga> findByID(Integer i){
        Manga found = null;
        for (Manga manga:mangas
        ) {
            if(manga.getId().equals(i)){
                found=manga;
            }
        }
        return Optional.ofNullable(found);
    }
*/
    //Programação funcional -> forma mais correta pois possui menos código boilerPlate

    public   static Optional<Manga> findBy(Predicate<Manga> predicate){
        Manga found = null;
        for (Manga manga:mangas
        ) {
            if(predicate.test(manga)){
                found=manga;
            }
        }
        return Optional.ofNullable(found);
    }

    public static Optional<Manga> findByTitle(String title){
       return findBy(m->m.getTitle().equals(title));
    }

    public   static Optional<Manga> findByID(Integer i){
        return findBy(f->f.getId().equals(i));
    }

}
