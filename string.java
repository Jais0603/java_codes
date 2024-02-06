public class string {
    public static void main(String[] args)
     {
        String str="If u want it , you will find a way to achieve it ";

        int n=str.length();
        System.out.println("the length of the string is "+n); 

        String t=str.toUpperCase();
        System.out.println("the uc value is "+ t);

          //String w=str.toLowerCase();
          //System.out.println("the lc value is "+ w);
        System.out.println(str.toLowerCase());
              
        System.out.println(str.trim());

        System.out.println(str.substring(6));

        System.out.println(str.substring(6,45));

        System.out.println(str.replace('a', 'o')  );

        System.out.println(str.replace("to", "try")  );

        System.out.println(str.startsWith("If"));

        System.out.println(str.endsWith("it "));

        System.out.println(str.charAt(7));

        System.out.println(str.indexOf("l"));

        System.out.println(str.indexOf("l",24));

        System.out.println(str.lastIndexOf("t"));

        System.out.println(str.lastIndexOf("t",30));

        System.out.println(str.equals("yuio"));

        System.out.println(str.equals("If u want it , you will find a way to achieve it "));

        System.out.println(str.equalsIgnoreCase("if u want it , you will find a way to achieve it "));    
    }
}
