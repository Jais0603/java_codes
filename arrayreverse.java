public class arrayreverse {
public static void main(String[] args) {
        int arrA[] = { 45 , 56 , 21 , 3 , 0 , 74 , 1 , 80 , 90 , 100 };
        int arrB[] = new int [arrA.length];

        // Ab ham arrayA ke elements ko Reverse order me copy krenge
        // reverse me copy krne ke liye 
        // kya krna hoga matlab arrayA ka last wala ArraB ke first me aajaye 
        // isme sab indexing ka game hai javascript 

        // dekho arrB[0]=arrA[9] ke equal se kya hoga 
        // arrA ka last element arrA ke first me aajayega
        // dekho arrB[1]=arrA[8] ke equal se kya hoga 
        // dekho arrB[2]=arrA[7] ke equal se kya hoga 
        // dekho arrB[3]=arrA[6] ke equal se kya hoga 
        // dekho arrB[4]=arrA[5] ke equal se kya hoga 

        // matlab loop chalega aarB[i] = arrA[arrA.lenght-1] kuchh aisa
        
        
        // copy kr diya hamne ise copy pe bna kr dry run krke dekho 
        // samjh aajayega 
        for(int i =0 ; i<arrA.length; i++){
            
            // arrA[arrA.length-1-i] ka matlab arrA[10-1-0(zero kyo kyoki starting me i ki value 0 hai )]
            
            arrB[i]=arrA[arrA.length-1-i];

        }

         // printing the arrayA
         System.out.print("Array A is = ");
         for(int j =0; j<arrB.length; j++){
            System.out.print(arrA[j]+"  ");
        }
          
        // for line change 
        System.out.println();


        // printing the arrayB
        System.out.print("Array B is = ");
        for(int j =0; j<arrB.length; j++){
            System.out.print(arrB[j]+"  ");
        }

    }
}