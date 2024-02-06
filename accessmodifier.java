


public class accessmodifier {

    public String str_1="I am public member";

    void printFromClass(){
        System.out.println("Wiyhin class:" + str_1);
    }

    public static void main(String[] args) {
        accessmodifier obj = new accessmodifier();
        obj.printFromClass();
        System.out.println("Within class: " + obj.str_1);
        accessmodifier2 obj2 = new accessmodifier2();
        obj2.printFromOutsideClass();
        

    }
}

class accessmodifier2{

}
