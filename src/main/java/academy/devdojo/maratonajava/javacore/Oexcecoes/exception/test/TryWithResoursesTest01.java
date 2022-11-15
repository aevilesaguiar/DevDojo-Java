package academy.devdojo.maratonajava.javacore.Oexcecoes.exception.test;

import academy.devdojo.maratonajava.javacore.Oexcecoes.exception.dominio.Leitor1;
import academy.devdojo.maratonajava.javacore.Oexcecoes.exception.dominio.Leitor2;

import java.io.*;

public class TryWithResoursesTest01 {
    public static void main(String[] args) {

        lerArquivos();

    }

    public static void lerArquivos(){

        try (Leitor1 leitor1= new Leitor1(); Leitor2 leitor2=new Leitor2()){

        }catch (IOException e){

        }

    }

    public static void lerArquivo2(){
        Reader reader = null;

        try {
            reader=new BufferedReader(new FileReader("teste.txt"));

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(reader!=null){
                reader.close();}
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
