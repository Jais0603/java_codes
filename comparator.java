import java.util.*;
class student // implements Comparator <student>
{

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
}

class CgpaSort implements Comparator<student>
{
    public int compare( student s1, student s2)
    {
        return(s2.cgpa>s2.cgpa ? 1:-1);
    }
}
class RollSort implements Comparator<student>
{
    public int compare(student s1, student s2)
    {
        return (s1.rollno> s2.rollno ?1:-1);
    }

}
public class comparator {
    public static void main(String[] args) {
        ArrayList<student> i = new ArrayList<student>();
        i.add(new student("Sakshi Jaiswal", 31, 9.7));
        i.add(new student("Keshav Kumar", 22, 8.7));
        i.add(new student("Akanksha Jaiswal", 16, 7.7));

        Collections.sort(i, new CgpaSort());
        Iterator itr=i.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        Collections.sort(i,new RollSort());
   
        itr=i.iterator();
        while(itr.hasNext())
       {
           System.out.println(itr.next());
       }
    }
    
    }
    

