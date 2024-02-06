public class loopclass {
    public static void main(String[] args) {
        //int a, b;
        //b=5;
        // for(int i=0;i<5;i++)
        // System.out.println(i++);
        // for(a=0;a<b;a++){
        //     System.out.println("a=" + a);
        //     System.out.println("b=" +b);
        //     b--;
        //}
        // int x,y;
        // for(x=0,y=5;x<=y;x++,y--){
        //     System.out.println("x= " + x);
        //     System.out.println("y= "+ y);
        // }
        // for(int i=1,j=5;i>0 && j>2;i++,j--){
        //     System.out.println("i is :"+ i + " and j is :"+ j);
        // }

    //     int i=0;
    //     for(;i<5;)
    //     System.out.println(i++);
    // int num []={1,2,3,4,5}; 
    // int sum=0;
    // for(int i:num){
    //     System.out.println("Value is :" + i);
    //     sum +=i;
    // } 
    // System.out.println("Sum is :" + sum);
    int sum=0;
    int num[][]=new int [3][5];
    for(int i=0;i<3;i++){
        for(int j=0;j<5;j++)
        num[i][j]=(i+1)*(j+1);
        for(int x[]:num){
            for(int y:x){
                System.out.println("Value is :"+ y);
                sum+=y;
            }
        }
        System.out.println("Sumation is :" + sum);
    }                   
}
}

    