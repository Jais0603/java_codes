public class twentyfourtable {
    public static void main(String[] args) {
        printtable(24);

        printtable(29);
        printtable(39);
    }
    static void printtable(int x){
        for(int i =1; i<= 10; i++){
            int c= x*i;
            System.out.println(x+" x "+i+ " = "+c);
        }
        System.out.println();
    }
}
