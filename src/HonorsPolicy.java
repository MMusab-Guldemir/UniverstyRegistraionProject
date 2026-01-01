public class HonorsPolicy implements IRegistrationPolicy{

    @Override
    public boolean canRegister(User user, Course course){
        if (user instanceof Student){
            Student ogrenci = (Student) user;
            System.out.println("" + user.name + " is applying for honors course " + course.courseName);
            return ogrenci.gpa >= 0; // ogrenci için gerekli minumum not ortalamasi
        }

        else
        {
            return false; // ogretmenler onur derslerine kayit olamaz
        }
    }
    
}
