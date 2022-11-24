package academy.devdojo.maratonajava.javacore.Ventradaesaidadedadosio;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Date;

public class FileTest01 {
    // Classes Utilitárias - IO pt 01 - File
    public static void main(String[] args) {

        File file= new File("C:\\JAVA\\DevDojo-Jva\\arquivo\\file.txt");
        File file2= new File("C:\\JAVA\\DevDojo-Jva\\arquivo\\a.txt");
        File file3= new File("C:\\JAVA\\DevDojo-Jva\\arquivo\\b.txt");

        //teste
        try {

           boolean isCreated = file2.createNewFile();
            System.out.println(isCreated);


            System.out.println("path: "+file.getPath());
            System.out.println("path absolute: "+file.getAbsolutePath());
            System.out.println("is directory: "+file.isDirectory());
            System.out.println("is file: "+file.isFile());
            System.out.println("is hidden: "+file.isHidden());//o arquivo é oculto?
            System.out.println("last modified: "+file.lastModified());//quando foi modificado?
            System.out.println("last modified: "+new Date(file.lastModified()));//quando foi modificado?
            System.out.println("last modified: "+ Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());//quando foi modificado?
            System.out.println("last modified: "+ Instant.ofEpochMilli(file.lastModified()));//quando foi modificado?


            /* boolean isCreated2 = file3.createNewFile();
            System.out.println(isCreated2);


            boolean isCreated3 = file2.createNewFile();
            System.out.println(isCreated3);

            //verifica se o arquivo existe para poder deletar
            if (file2.exists()){
                boolean delete = file2.delete();
                System.out.println(delete);
            }
*/

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}
