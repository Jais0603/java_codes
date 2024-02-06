public class printdigits {
    public static void main(String[] args) {
        int x=45678;
        int n;
        n= x%10;
        x=x/10;
        System.out.println();
        while(x!=0)
        {
            System.out.println(n);
        }
        
    }
}
