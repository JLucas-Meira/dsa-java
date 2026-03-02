package java_core.collections.curingas.delimited;

import java.util.ArrayList;
import java.util.List;

public class GetCovariancia {
    public static void main(String[] args) {

        List<Integer> intList = new ArrayList<Integer>();

        intList.add(10);
        intList.add(5);

        List<? extends Number> list = intList;
        Number x = list.get(0); //get OK

        // list.add(20); put ERROR (erro de compilacao)
    }
}
