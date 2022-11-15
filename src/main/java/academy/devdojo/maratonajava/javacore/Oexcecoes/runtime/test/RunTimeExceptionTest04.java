package academy.devdojo.maratonajava.javacore.Oexcecoes.runtime.test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RunTimeExceptionTest04 {
    public static void main(String[] args) {

        try {

            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(" Dentro do ArrayIndexOutOfBoundsException ");
        }catch (IndexOutOfBoundsException e){
            System.out.println("Dentro Array IndexOutOfBoundsException");
        }catch (IllegalArgumentException e){
            System.out.println("Dentro do IllegalArgumentException");
        }catch (ArithmeticException e){
            System.out.println("Dentro do ArithmeticException");
        }catch (RuntimeException e){
            System.out.println("Dentro do runtimeException");
        }


        try {

            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException| IllegalArgumentException | ArithmeticException e){
            System.out.println(" Dentro do ArrayIndexOutOfBoundsException| IllegalArgumentException | ArithmeticException ");
        }catch (RuntimeException e){
            System.out.println("Dentro do runtimeException");
        }

        try {
            talvezLanceException();
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }


    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }

}
