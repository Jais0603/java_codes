public class classbox {


    double width;
    double height;
    double length;
    

    public classbox()


    {
        width = 1;
        height = 1;
        length = 1;
    }


    public classbox(double value) 


    {
        width =  value;
        height =  value;
        length = value;
    }


    public classbox(double width, double height, double length)


    {
        this.width = width +50;
        this.height = height+50;
        this.length = length+50;
    }


        void display ()


        {
            System.out.println("Box width:" + ""+ width);
            System.out.println("Box height:"+ ""+ height);
            System.out.println("Box length:"+ "" +length);
        }


        double computevolume()


        {


            return width*height*length;


        }
        
        
            public static void main(String[] args)


            {

                classbox b1= new classbox();
                classbox b2= new classbox(20.0);
                classbox b3= new classbox(10,20,30);
                b1.display();
                b2.display();
                b3.display();
                double v1= b1.computevolume();
                System.out.println(b1.computevolume());
                System.out.println(b2.computevolume());
                System.out.println(b3.computevolume());


                
            }
        }