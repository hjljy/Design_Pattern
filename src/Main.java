import flyweight.ConcreteFlyweight;
import singleton.Singleton;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();
        System.out.println(System.currentTimeMillis());
        for (int i=0; i<2000000;i++){
           Integer a=new Integer(i);
           data.add(a);
       }
        System.out.println(System.currentTimeMillis());
        List<Integer> data1 =data;
        System.out.println(System.currentTimeMillis());
        List<Integer> data2 = (List<Integer>) data.clone();
        System.out.println(System.currentTimeMillis());
    }
}
