package odevler.hafta3.odev3.dataAccess;

import odevler.hafta3.odev3.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class JdbcCourseDao implements CourseDao{
    List<Course> courses=new ArrayList<>();
    @Override
    public void add(Course course) {
        System.out.println("Kurs: "+course.getName() + "JDBC ile kaydedildi");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Kurs: "+course.getName() + "JDBC ile silindi");
    }

    @Override
    public List<Course> getAllCourses() {
        System.out.println("Kurslar JDBC ile getirildi");
        return courses;
    }
}
