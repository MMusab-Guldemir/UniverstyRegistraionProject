import java.io.OutputStream;

public class StandartPolicy implements IRegistrationPolicy{
    
    // standart olarak tüm kullaniciların dolu olmaytan derslere kayit alabiceği politilasını uygular
    @Override
    public boolean canRegister(User user ,Course course){
        // ders dolu değilse kayit olabilir
        if (course.isFull() == false){
            System.out.println("" + user.name + " can register for the course " + course.courseName);
            return true;
        }
        else 
        {
            // doluysa kayıt olmaz
            System.out.println("Course is full. Cannot register " + user.name);
            return false;
        }
    }
}
