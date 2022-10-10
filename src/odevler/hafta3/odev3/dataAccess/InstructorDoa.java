package odevler.hafta3.odev3.dataAccess;

import odevler.hafta3.odev3.entities.Instructor;

import java.util.List;

public interface InstructorDoa {
    void add(Instructor instructor);
    void delete(Instructor instructor);
    void update(Instructor instructor);
    List<Instructor> getAllInstructors();
}
