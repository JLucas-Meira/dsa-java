package java_core.basics.loops;

public class for_each_1 {
    public static void main(String[] args){

        String[] vect = new String[] {"Maria", "Bob", "Alex"};

        for (int i=0; i< vect.length; i++){
            System.out.println(vect[i]);
        }

        System.out.println("------------------------------");

        //Leitura: Para cada objeto 'obj' contido em vect, faça:
        for (String obj : vect){
            System.out.println(obj);
        }

    }
}
