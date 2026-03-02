package java_core.collections.curingas.delimited;

import java.util.ArrayList;
import java.util.List;

public class PutContravariancia {
    public static void main(String[] args) {
        List<Object> myObjs = new ArrayList<Object>();

        myObjs.add("Maria");
        myObjs.add("Alex");

        List<? super Number> myNums = myObjs;
        myNums.add(10); //PUT OK
        myNums.add(3.14);

        // Number x = myNums.get(0); GET ERROR (erro de compilacao)
    }
}
