package academy.devdojo.maratonajava.javacore.Pwrapper.test;

public class WrapperTest01 {
    public static void main(String[] args) {

        byte byteP = 1;
        short shortP=1;
        int intP =1;
        long longP = 10L;
        float floatP=10F;
        double doubleP = 10D;
        char charP='W';
        boolean booleanP = false;

        //Todos esses tipos são Objetos agora
        Byte byteW = 127;
        Short shortW=1;
        Integer intW =1;
        Long longW = 10L;
        Float floatW=10F;
        Double doubleW = 10D;
        Character charW='W';
        Boolean booleanW = false;

        int i = intW;//unboxing
        System.out.println(i);
        i=intW.intValue();
        System.out.println(i);

        Integer intw2=Integer.parseInt("1"); //unboxing
        System.out.println(intw2);

        System.out.println(Character.isDigit('r'));
        System.out.println(Character.isDigit('9'));
        System.out.println(Character.isLetterOrDigit('!'));
        System.out.println(Character.isLetterOrDigit('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isLowerCase('a'));
        System.out.println(Character.toLowerCase('A'));
        System.out.println(Character.toUpperCase('a'));


    }
}
