import javax.sql.rowset.spi.SyncResolver;

class parent{

    static {
        System.out.println("parent static book");
    }
    {
    System.out.println("init block1");
}
parent(){
    System.out.println("Parent 0 arg constructor ");
}
parent (int x){
    System.out.println("parent 1 arg constructor");
}
{
        System.out.println("init block2");

    }
    
}
class child extends parent{

static {
    System.out.println("Child static block");
}
child() 
{
    System.out.println("child 0 arg constructor");
}
{
    System.out.println("init block3");
}

}

public class constructor1   
{
    
    public static void main(String[] args) {
        parent p = new parent();
        parent p1 = new parent(10);
        child c= new child();
        child c1= new child();
        child c2= new child();

        
        
    }
    
}
