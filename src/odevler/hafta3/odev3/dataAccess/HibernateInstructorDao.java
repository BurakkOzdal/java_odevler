package odevler.hafta3.odev3.dataAccess;

import odevler.hafta3.odev3.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class HibernateInstructorDao implements InstructorDoa{
    List<Instructor> instructors=new ArrayList<>();
    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitmen: "+instructor.getName() + "Hibernate ile kaydedildi");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Eğitmen: "+ instructor.getName() + "Hibernate ile kaydedildi");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Eğitmen: "+instructor.getName() + "Hibernate ile güncellendi");

    }

    @Override
    public List<Instructor> getAllInstructors() {
        System.out.println("Eğitmenler Hibernate ile getirildi");
        return instructors;
    }
}
