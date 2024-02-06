class ArrayExample{



    void multiArrays(){
        int [][] arr1= new int[5][3];

        System.out.println(arr1[0][0]);
        int [][] arr2 = {{56,43,6}, {34,7,25}, {89,56,23}};



        System.out.println(arr2[0][0]);
        System.out.println(arr2[0][1]);
        System.out.println(arr2[0][2]);

        System.out.println(arr2[1][0]);
        System.out.println(arr2[1][1]);
        System.out.println(arr2[1][2]);

        System.out.println(arr2[2][0]);
        System.out.println(arr2[2][1]);
        System.out.println(arr2[2][2]);
    }

    void demoArrays(){

        int [] ages= new int [3];
        float [] weight= new float [3];
        String  [] names = new String [3];


        ages[0] = 34;
        ages[1]= 12;
        ages[2]= 12;
        //ages[5] = 49; this will give index out of bound error.


        System.out.println(ages.length);
        System.out.println(weight.length);
        System.out.println(names.length);



        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);


        
        weight[0] =23f;
        weight[1] =83f;
        weight[2] =93f;

        
        System.out.println(weight[0]);
        System.out.println(weight[1]);
        System.out.println(weight[2]);
   

        names[0] = "sakshi ";
        names[1] = "keshav ";
        names[2] = "Jaiswal ";


        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

    }
}

public class exampleArray {
    public static void main(String[] args) {

        ArrayExample obj= new ArrayExample();
        obj.demoArrays();
        obj.multiArrays();
        
    }
    
}
