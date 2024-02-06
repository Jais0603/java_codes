public class patient {
    String patient_name;
    int age;
    long contact_number;
    patient(){
        patient_name="no name"; age=-1; contact_number=0;
    }
    patient(String name){
this.patient_name= name;
this.age= age;
this.contact_number= contact_number;
    }
    public void display(){

        System.out.println(patient_name+ " "+age +" " + contact_number )
    }
    public static void main(String[] args) {
        
    }
}
