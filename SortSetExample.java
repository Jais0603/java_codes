
public class SortSetExample {
    public static void main(String[] args) {
        
    
    Employee emp1=new Employee("sam","4");
    Employee emp2=new Employee("amy","2");
   Employee emp3=new Employee("brad","1");
    Set<Employee> treeSet = new TreeSet<Employee>(new Comparator<Employee>() {
    public int compare(Employee o1, Employee o2) 		
    	{ 
            return o1.name.compareTo(o2.name); 
        }
   	
    	});
    treeSet.add(emp1);
    treeSet.add(emp2);
    treeSet.add(emp3);
    System.out.println("treeSet : "+treeSet);  
       }}
    