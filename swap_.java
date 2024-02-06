
public class swap_ {

    static void swap1(int a, int b){

        System.out.println("Original values of a and b before swap");
        System.out.println("a: " +a);
        System.out.println("b: " +b);

        int temp =a;
        a=b;
        b= temp;

        System.out.println("values of a and b after swap");
        System.out.println("a: " +a);
        System.out.println("b: " +b);


    }

    public static void main(String[] args) {

        int a=90;
        int b= 78;
        //int [] arr={1,2,3,4,5};
        swap1(a, b);
    }
    
}
