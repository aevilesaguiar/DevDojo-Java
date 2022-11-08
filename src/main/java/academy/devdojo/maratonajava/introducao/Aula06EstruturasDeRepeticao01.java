package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        //while, do while, for

        int count=0;

        while(count<10){
            System.out.println(count);
            count++;
        }

        count=0;
        System.out.println("----------------------------");
        while(count<10){
            System.out.println(++count);
        }
        System.out.println("----------------------------");

        count=0;
        do {
            System.out.println("dentro do dowhile "+count);
            count++;
        }while (count<5);
        System.out.println("------------------------");

        for(int i=0;i<10;i++){
            System.out.println(i);
        }
        System.out.println("------------------------");


        for (int i = 0; i <5 ; i++) {
            if(i>1){
                System.out.println(i++);
            }

        }

    }
}
