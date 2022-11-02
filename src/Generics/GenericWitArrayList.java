package Generics;

import java.util.ArrayList;
import java.util.Date;

//List с дженериками на Integer и Date
public class GenericWitArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i <= 100; i++) {
            list.add(i);
        }
        for(int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
        System.out.println();
        ArrayList<Date> list2 = new ArrayList<>();
        list2.add(new Date());
        for (Date date : list2) {
            System.out.println(date);
        }
    }
}
