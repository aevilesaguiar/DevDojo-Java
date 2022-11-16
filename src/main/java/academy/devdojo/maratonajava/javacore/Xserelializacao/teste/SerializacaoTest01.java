package academy.devdojo.maratonajava.javacore.Xserelializacao.teste;

import academy.devdojo.maratonajava.javacore.Xserelializacao.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Xserelializacao.dominio.Turma;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializacaoTest01 {
    public static void main(String[] args) {


        Aluno aluno = new Aluno(1L,"João da Silva","123456");
        Turma turma =new Turma("Maratona Java");
        aluno.setTurma(turma);
       // serializar(aluno);
        deserializar();




    }

    private static void serializar(Aluno aluno){

        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectOutput output= new ObjectOutputStream(Files.newOutputStream(path))){
        output.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }

}

    private static void deserializar(){

        Path path = Paths.get("pasta/aluno.ser");
        try (ObjectInputStream input= new ObjectInputStream(Files.newInputStream(path))){
           Aluno aluno=(Aluno) input.readObject();
            System.out.println(aluno);
        }catch (IOException e){
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
