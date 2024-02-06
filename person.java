class personn {
    String name;
    int age;
    String locality;
    private int id;
    personn(){
        name="noname";
        age=0;
        locality="no locality";
        id=0;
    }
    personn(String name, int age, String locality, int id){
        this.name= name;
        this.age=age;
        this.locality=locality;
        this.id=id;
    }
    void showdetails(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(locality);
        System.out.println(id);


    }

    class sportsperson extends personn
    {
        String major;
        sportsperson(){
            this.major="Not selected";
        }
        sportsperson(String name, int age, String locality, int id, String major ){
            super(name, age, locality,id);
            this.major=major;
        }
        void showDetails()
        {
        super.showdetails();
        System.out.println(major);
        }
    } 
    public class person()

        public static void main(String[] args) {
            
        }
    }



