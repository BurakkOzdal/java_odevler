package odevler.hafta3.odev3.dataAccess;

import odevler.hafta3.odev3.entities.Course;

import java.util.ArrayList;
import java.util.List;

public class HibernateCourseDao implements CourseDao{
    List<Course> courses=new ArrayList<>();
    @Override
    public void add(Course course) {
        System.out.println("Kurs: "+course.getName() + "Hibernate ile kaydedildi");
    }

    @Override
    public void delete(Course course) {
        System.out.println("Kurs: "+course.getName() + "Hibarnate ile silindi");
    }

    @Override
    public List<Course> getAllCourses() {
        System.out.println("Kurslar Hibernate ile kaydedildi");
        return courses;
    }
}
