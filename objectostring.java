// Object --- to string()

class Employee
{
    int rollno;
    String name;
    Employee(){}
    Employee(int rollno, String name)
        {
            this.rollno=rollno;
            this.name= name;
        }
            public String toString()
            {
                return "Employee" + name + rollno;
            }
           

    }

    public class objectostring {
    public static void main(String[] args) {
        Employee s1= new Employee(12,"sakshi");
        Employee s2= new Employee(31, "jaiswal");
        Employee s3;
        s3=s1;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s1==s3);
        System.out.println(s2==s3);
        System.out.println(s1.name.equals(s3.name));
        System.out.println(s3.name.equals(s2.name));
    
        
    }
    
}
