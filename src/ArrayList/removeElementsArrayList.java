package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class removeElementsArrayList {
    public static void main(String[] args){
        List<String> Names1= new ArrayList<>();

        Names1.add("Vrusharth");
        Names1.add("Poonam");
        Names1.add("Pookie");
        Names1.add("Pranjal");
        Names1.add("Prashant");
        Names1.add("Sandhya");

        System.out.println(Names1);

        // remove(index)
        Names1.remove(2);
        System.out.println("Removed Elment at index 2 'pookie' " + Names1);
        // remove(object// )
    }
}




