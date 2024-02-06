interface lamb1{
    int sum(int a, int b);
}
/* class testInt implements lamb1{
    public int sum(int a, int b)
    {return a+b;}
} */


public class lambda {
    public static void main(String[] args) {
        lamb1 lb1 = (int a, int b) -> a+b;
        System.out.println(lb1.sum(12,67));
        System.out.println(lb1.sum(82,27));
        System.out.println(lb1.sum(62,67));
    }
    
}


