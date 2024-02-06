public class enum1 {
    
    // public enum season{summer, winter, spring, rainy}
    
    //public static void main(String[] args) {
    
    //     for(season s: season.values())
    //     System.out.println(s);
    
    
    // enum with constructor;
    
    public enum monthwithdays{
        jan(31) , feb(28), mar(31), apr(31);
        int days;
        monthwithdays(int a){days=a;}
    }
        public static void main(String[] args) {
            for(monthwithdays D: monthwithdays.values())
            System.out.println(D);
            
        }
    }

    

