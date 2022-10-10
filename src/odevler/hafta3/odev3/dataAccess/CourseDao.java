package odevler.hafta3.odev3.dataAccess;

import odevler.hafta3.odev3.entities.Course;

import java.util.List;

public interface CourseDao {
    void add(Course course);
    void delete(Course course);
    List<Course> getAllCourses();
}
