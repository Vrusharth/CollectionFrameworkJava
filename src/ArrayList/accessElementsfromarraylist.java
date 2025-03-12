package ArrayList;

import java.util.ArrayList;
import java.util.List;

public class accessElementsfromarraylist {
    public static void main(String[] args) {
        List<String> Names=new ArrayList<>();
        // isEmpty : Boolean reply;
        System.out.println("Is the names list empty ?"+ Names.isEmpty());

        Names.add("Vrusharth");
        Names.add("Poonam");
        Names.add("Pookie");
        Names.add("Pranjal");
        // size of List
        System.out.println(Names);
        System.out.println("What is the size of Names List? "+ Names.size());

        // Access a particular element
        System.out.println("1st person is "+ Names.get(0));

        // modify/replace the element wrt index set(index,"element")
        System.out.println("First Person name change to Surname "+Names.set(0,"Nirmal"));
        System.out.println(Names);


    }
}
