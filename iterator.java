
import java.util.*;


public class  iterator {
    public static void main(String[] args) {
        ArrayList<Integer> abc=new ArrayList<>(15);
        abc.add(10);
        abc.add(110);
        abc.add(102);
        abc.add(130);
        abc.add(1350);
        abc.add(1540);
        abc.add(105);
        abc.add(106);
        abc.add(160);
        abc.add(170);
        abc.add(1590);
        abc.add(1034);
        abc.add(1340);
        abc.add(1054);
        abc.add(105);
        Iterator ls=abc.iterator();
        while(ls.hasNext()){
            System.out.println(ls.next());
        }
    }   
}