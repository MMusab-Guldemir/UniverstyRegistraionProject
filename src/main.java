public class main {

    public static void main(String[] args) {
        IRegistrationPolicy policy = new DumendenPolicy(); // policymizi belirliyoruz

        Student ogrenci1 = new Student("Yusuf", "yigit.korkmaz@uf.bilkent.edu tr", 223453, 4);
        Instructor mehmetHoca = new Instructor("Mehmet Hoca",  "mehmet.hoca@bilkent.edu.tr",234540, "Computer Science");
        Course cs101 = new Course("Introduction to Computer Science", 101, 60, mehmetHoca);
        RegistrationService regService = new RegistrationService(policy);

        regService.register(ogrenci1, cs101);
        cs101.displayCourseInfo();
    }
    
}
