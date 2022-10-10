package odevler.hafta3.odev3.core.validator;

import odevler.hafta3.odev3.entities.Instructor;

public class InstructorValidator {

    public static boolean isValid(Instructor instructor){
        return !instructor.getName().isEmpty();
    }
}
