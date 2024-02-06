//Write a function to calculate area of a circle.(Takes Something, Returns Something)


public class areaofcircle {
    public static void main(String[] args) {
        System.out.println("Area of circle is:-");
        printradius(5);
        printradius(6);
        printradius(15);
        printradius(25);
        printradius(65);

    }
    static void printradius(int u){
        float area;
        
        float pi=3.14f;
        area=pi*u*u;
        System.out.println(area);

    } 
}
