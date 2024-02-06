// WAP to create a classs student having attributes roll no, name,
// branch name and paramterized constructor accepting the name and branchname as parameter
// add display method to print the roll no ,, name, and branch name.
// auto generate roll no using the concept of static variable.




public class classstudent {

         static int nextRollNo = 1;
         int rollNo;
         String name;
         String branchname;
      
        public void Student (String name, String branchname) {
          this.rollNo = nextRollNo++;
          this.name = name;
          this.branchname = branchname;
        }
        //public static void display(String[] args) {
            
        
        void display() {
          System.out.println("Roll No: " + rollNo);
          System.out.println("Name: " + name);
          System.out.println("Branch Name: " + branchname);
        }
      }
      