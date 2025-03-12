package ArrayList;

import java.util.*;

public class iterateArrayList {
    public static void main(String[] args) {

        List<String> Fruits=new ArrayList<>();
        Fruits.add("Apple");
        Fruits.add("Guava");
        Fruits.add("Banana");
        Fruits.add("Orange");
        Fruits.add("Pear");
        //Iterate using basic for loop
        for (int i=0;i<Fruits.size();i++){
            System.out.println(Fruits.get(i));
        }
        System.out.println(Fruits);
        // Enhanced for loop
        for(String Fruit:Fruits){
            System.out.println(Fruit);
        }
//        Iterator<String> iterate=Fruits.iterator();
//        while(iterate.hasNext()){
//            System.out.println();
//        }

        // java 8 stream + lambda
        Fruits.forEach(System.out::println);
        // java 8 forEach+ lambda
        Fruits.forEach(System.out::println);
    }
}
