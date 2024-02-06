import java.util.*;

public class arraystring {

    public static void main(String[] args) {
        ArrayList a1= new ArrayList();
        ArrayList a2= new ArrayList(20);
        a1.add(10);
        a1.add("Sakshi");
        a1.add(20.5);
        a1.add(1,"keshav");
        System.out.println(a1);
        
        a2.addAll(a1);
        System.out.println(a2);
        
        ArrayList a3= new ArrayList(a2);
        a3.add();
        System.out.println(a1.size());
        System.out.println(a2.size());

    }
}
