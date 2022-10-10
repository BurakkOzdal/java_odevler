package odevler.hafta3.odev3.core.validator;

import odevler.hafta3.odev3.entities.Course;

public class CourseValidator {
    public static boolean isValid(Course course){
        return course.getPrice()>0&&!course.getName().isEmpty();
    }
}
