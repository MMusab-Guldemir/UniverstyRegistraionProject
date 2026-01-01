public class Instructor extends User {
    String department; // eğitmenin çaliştiği bölüm

    public Instructor(String name, String email, int ID, String department) {
        super(name, email, ID);
        this.department = department;
    }

    // oğretmenlerin bilgilşerini ekrena yazdiran metod
    @Override
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("ID: " + ID);
        System.out.println("Department: " + department);
    }
    
}
