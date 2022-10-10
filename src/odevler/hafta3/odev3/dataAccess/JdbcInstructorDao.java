package odevler.hafta3.odev3.dataAccess;

import odevler.hafta3.odev3.entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class JdbcInstructorDao implements InstructorDoa{
    List<Instructor> instructors=new ArrayList<>();
    @Override
    public void add(Instructor instructor) {
        System.out.println("Eğitmen: "+instructor.getName() + "JDBC ile eklendi");
    }

    @Override
    public void delete(Instructor instructor) {
        System.out.println("Eğitmen: "+instructor.getName() + "JDBC ile silindi");
    }

    @Override
    public void update(Instructor instructor) {
        System.out.println("Eğitmen: "+instructor.getName() + "JDBC ile güncellendi");
    }

    @Override
    public List<Instructor> getAllInstructors() {
        System.out.println("Eğitmenler JDBC ile getirildi");
        return instructors;
    }
}
