//import java.lang.instrument.Instrumentation;
import java.util.*;
class student implements Comparable <student>{
    String name;
    int rollno;
    double cgpa;
    student(){}
    student(String n, int roll, double cg)
    {
        name= n;
        rollno=roll;
        cgpa= cg;
    }
    public String toString(){
        return "name is: "+ name +"roolno is:" + rollno +"cgpa is:" +cgpa;

    }
    public int compareTo(student st)
    {
        return (this.rollno>st.rollno ? 1:-1);

    }
public class comparable{
    
    public static void main(String[] args) {
        ArrayList<student> i = new ArrayList<student>();
        i.add(new student("Sakshi Jaiswal", 31, 9.7));
        i.add(new student("Keshav Kumar", 22, 8.7));
        i.add(new student("Akanksha Jaiswal", 16, 7.7));
        Collections.sort(i);
        Iterator itr=i.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}

    
}
