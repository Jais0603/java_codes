import javax.swing.plaf.synth.SynthOptionPaneUI;

public class copyarray {
    public static void main(String[] args) {
        int arrA[]={ 45 , 56 , 21 , 3 , 0 , 74 , 1, 80,};
        int arrB[]= new int[arrA.length];
        for(int i=0; i<arrA.length; i++){
            arrB[i]=arrA[i];
        }
        System.out.println("the array B is:");
        for(int i=0; i<arrA.length;i++){
            System.out.print(arrB[i]+ "  ");
        }
    }
}
