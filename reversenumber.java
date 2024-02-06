public class reversenumber {
    public static void main(String[] args) {
        int num=987;
        int num2=0;
        while(num>0){
            int r= num%10;
            num2 = num2*10 +r;
            num= num/10;
        }
        System.out.println(num);
    }
}
