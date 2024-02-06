public class countdigit {
    public static void main(String[] args) {
        int a=87695;
        int c =countdigit(a);
        System.out.println(c);
    
    
    }
    static int  countdigit(int x){
        int count=0;
        while(x>0){
            x=x/10;
         count++;
         
        }
        //System.out.println(count);
        return count;
    }
}
