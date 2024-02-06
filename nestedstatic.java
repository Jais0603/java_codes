// // a static nested class
// // outer class
// class OuterClass
// { 
// static int outer_x = 10;
// int outer_y = 20;
// private static int outer_private = 30;
// static class StaticNestedClass
// {
// void display()
// {

// System.out.println("outer_x = " + outer_x);


// System.out.println("outer_private = " + outer_private);
// System.out.println("outer y = " + outer_y);


// }
// }
// }
// public class nestedstatic{
//     public static void main(String[] args) {
//         Outerclass.StaticNestedClass nesteedobject = new Outerclass.StaticNestedClass display();
//    }
// }



// class OuterClass
// { 
// static int outer_x = 10;
//  int outer_y = 20;
//  private int outer_private = 30;
// class InnerClass
//     {
//         void display()
//         {
// System.out.println("outer_x = " + outer_x);
// System.out.println("outer_y = " + outer_y);
// System.out.println("outer_private = " + outer_private);
         
//         }
//     }
// }

// public class nestedstatic
// {
//     public static void main(String[] args)
//     {
// OuterClass outerObject = new OuterClass();
// OuterClass.InnerClass innerObject = outerObject.new InnerClass();
//       innerObject.display();
         
//     }
// }


class abc 
{
    int a=89,b=85;
    void calculate()
    {
        class def
        {
            int sumCalculate()
            {
                return (a+b);
            }
            int mulCalculate()
            {
                return (a*b);
            }
        }
        def ob=new def();
        System.out.println("Sum is "+ ob.sumCalculate());
        System.out.println("Multiplication is "+ ob.mulCalculate());
    }
}

public class nestedstatic
{
	public static void main(String[] args) 
	{
		abc ob = new abc();
		ob.calculate();
	}
}