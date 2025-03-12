package ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class arrayList {
    public static void main(String[] args) {
        Collection<String> collection=new ArrayList<>();
        collection.add("Vrusharth");
        collection.add("Poonam");
        collection.add("Aditya");
        System.out.println(collection);

        collection.remove("Aditya");
        System.out.println(collection);

        // contains return boolean value
        boolean a=collection.contains("Vrusharth");
        System.out.println(a);
//        collection.forEach((element)->{
//            System.out.println(element);
//        });

        // List
        // 1. allows to add duplicate element
        // 2. allows null
        // 3. has control over index

        List<String> Names=new ArrayList<>();
        Names.add("Vrusharth");// 0
        Names.add("Poonam");// 1
        Names.add("Soham");// 2
        Names.add("Martin");// 3

        System.out.println(Names.get(3 ));
        System.out.println(Names);

        List<Integer> primeNumbers=new ArrayList<>();
        primeNumbers.add(2);
        primeNumbers.add(3);
        primeNumbers.add(5);

        List<Integer> primeNumbers2=new ArrayList<>();
        primeNumbers2.add(7);
        primeNumbers2.add(11);
        primeNumbers2.add(13);

        // addAll concatenates two arrays

        primeNumbers.addAll(primeNumbers2);
        System.out.println(primeNumbers);

    }
}
