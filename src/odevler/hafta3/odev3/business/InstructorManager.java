package odevler.hafta3.odev3.business;

import odevler.hafta3.odev3.core.logging.Logger;
import odevler.hafta3.odev3.core.validator.InstructorValidator;
import odevler.hafta3.odev3.dataAccess.InstructorDoa;
import odevler.hafta3.odev3.entities.Instructor;

public class InstructorManager {
    private InstructorDoa instructorDoa;
    private Logger[] loggers;

    public InstructorManager(InstructorDoa instructorDoa, Logger[] loggers) {
        this.instructorDoa = instructorDoa;
        this.loggers=loggers;
    }

    public void add(Instructor instructor){
       if (InstructorValidator.isValid(instructor)){
           System.out.println("Kayıt Başarılı...");
           instructorDoa.add(instructor);
           for (Logger logger:loggers){
               logger.log(instructor.getName());
           }
       }else {
           System.out.println("Bilgileri Kontrol ediniz...");
       }
    }
}
