class Box 
{
	private double width;
	private double height;
	private double depth;
	Box(Box ob) 
    
    { 	// pass object to constructor
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
		}
	Box(double w, double h, double d) {
		width = w;
		height = h;
		depth = d;
		}
	Box()
     {
		width = -1; // use -1 to indicate
		height = -1; // an uninitialized
		depth = -1; // box
	           }
	Box(double len) 
    {
		width = height = depth = len;
	           }
	double volume() 
    {
		return width * height * depth;
	}               
}
// BoxWeight now fully implements all constructors.
class BoxWeight extends Box 
{
	double weight; // weight of box
// construct clone of an object
	BoxWeight(BoxWeight ob) { // pass object to constructor
		super(ob);
		weight = ob.weight;
		}
// constructor when all parameters are specified
	BoxWeight(double w, double h, double d, double m)
     {
		super(w, h, d);         // call superclass constructor
		weight = m;
		}
// default constructor
	BoxWeight() 
    {
		super();
		weight = -1;
	               }
// constructor used when cube is created
	BoxWeight(double len, double m)
     {
		super(len);
		weight = m;
		}
	}

   public class boxmulti 
   {
        public static void main(String args[]) {
            BoxWeight mybox1 = new BoxWeight(50, 30, 10, 53.5);
            BoxWeight mybox2 = new BoxWeight(4, 8, 3, 0.9856);
            BoxWeight mybox3 = new BoxWeight(); // default
            BoxWeight mycube = new BoxWeight(3, 2);
            BoxWeight myclone = new BoxWeight(mybox1);
            double vol;
            vol = mybox1.volume();
            System.out.println("Volume of mybox1 is " + vol);
            System.out.println("Weight of mybox1 is " + mybox1.weight);
            System.out.println();
            vol = mybox2.volume();
            System.out.println("Volume of mybox2 is " + vol);
            System.out.println("Weight of mybox2 is " + mybox2.weight);
		    System.out.println();
		    vol = mybox3.volume();
		    System.out.println("Volume of mybox3 is " + vol);
            System.out.println("Weight of mybox3 is " + mybox3.weight);
            System.out.println();
            vol = myclone.volume();
            System.out.println("Volume of myclone is " + vol);
            System.out.println("Weight of myclone is " + myclone.weight);
            System.out.println();
            vol = mycube.volume();
            System.out.println("Volume of mycube is " + vol);
            System.out.println("Weight of mycube is " + mycube.weight);
            System.out.println();
		}
	}
                 
    

