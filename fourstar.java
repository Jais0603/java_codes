public class fourstar {
public static void main(String[] args) {
    printstar(3);
    printstar(4);
    printstar(5);
    printstar(10);
}
static void printstar(int x){
    for(int i = 1; i<=x; i++){
        for (int j = 1; j<=i; j++){
            System.out.print("*" + " ");
        }
        System.out.println();
    }
} 
}
