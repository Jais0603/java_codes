
class Gen<T>{
    T ob;
    Gen(T o)
    {
        ob=o;
    }
    T getob()
    {
        return ob;
    }
    void showType() 
       { 
		System.out.println("Type of T is " +ob.getClass().getName());
	   }
	}
    public class gen {
        public static void main(String[] args) {
            Gen<Integer> iOb;
		iOb = new Gen<Integer>(88);
		iOb.showType();
		int n = iOb.getob();
		System.out.println("value: " + n);
        Gen<String> strOb = new Gen<String>("Generics Test");
		strOb.showType();
		String str = strOb.getob();
		System.out.println("value: " + str);

            
        }
    
    }


