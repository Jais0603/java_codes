
abstract class GeometricFigure{
    double dim1,dim2;
    GeometricFigure(double dim1,double dim2){
    this.dim1=dim1; this.dim2=dim2;
    }
      void showDetails(){System.out.println(dim1+" "+dim2);}
    abstract double getArea();
    }
    
    class Rectangle extends GeometricFigure{
    Rectangle(double dim1, double dim2){
    super(dim1,dim2);
    }
    
    public double getArea()
    {
    return dim1*dim2;
    }
    }
    
    
    
    public class bstract {
    
        Rectangle r= new Rectangle(20,10);
        System.out.println(r.getArea());






    
}
   