package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        int age = 66;
        boolean isAutorizadoDirigir=age>=18;
        //operador de negação !


        if(isAutorizadoDirigir){
            System.out.println("Pode dirigir");
        }else{
            System.out.println("Não permitido dirigir");
        }

        // == false  é a mesma coisa que !

        if(isAutorizadoDirigir==false){
            System.out.println("é necessário ter 18 anos ou mais");
        }

        if(!isAutorizadoDirigir){
            System.out.println("é necessário ter 18 anos ou mais");
        }else if (age>65) {
            System.out.println("é necessário ser avaliado");
        }





        System.out.println("Fora do if");
    }
}
