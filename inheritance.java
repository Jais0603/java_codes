 class inheritance {

    int rollno;
    double height;
    String name;
    double weight;
    double bmi;
    inheritance()
    {
        rollno=0;
        name="noname";
        weight=height=0;


    }
    inheritance(int rollno, String name, double weight, double height){
        this.rollno=rollno;
        this.name= name;
        this.weight=weight;
        this.height=height;

    }
    void showdetails()
    {
        //print all details of student 
    }

    class csestudents extends inheritance
    {
        String major;
        csestudents(){this.major="Not Selected";}
        csestudents(int rollno,String name, double weight, double height,String major)
        {
            super(rollno, name, weight, height);
            this.major=major;
        }
    }
    public class Student{
    public static void main(String[] args) {
        inheritance s1 = new inheritance();
        inheritance s2= new inheritance (22,"sakshi ", 65,3.4);
    }
}
}

