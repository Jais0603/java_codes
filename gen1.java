
class TwoGen<T,V>
{
    T ob1; 
    V ob2;
    TwoGen(T o1, V o2){
        ob1= o1; 
        ob2=o2;}
        void showTypes(){
            System.out.println("Type of T is " + ob1.getClass());
            System.out.println("Type of T is " + ob2.getClass());

        }
        T getobj1()
        {
            return ob1;
        }
        V getob2()
        {
            return ob2;
        }
    }
    public class gen1 {
    public static void main(String[] args) {
        TwoGen<Integer, String> t= new TwoGen<Integer, String>(123,"testing Two Parameter");
        t.showTypes();
        int v= t.getob1();
        System.out.println("Value:" + v);
        String str= t.getob2();
        System.out.println("Value:" + str);
    }
    }
