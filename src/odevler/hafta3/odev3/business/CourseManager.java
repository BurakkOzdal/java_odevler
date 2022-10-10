package odevler.hafta3.odev3.business;

import odevler.hafta3.odev3.core.logging.Logger;
import odevler.hafta3.odev3.core.validator.CourseValidator;
import odevler.hafta3.odev3.dataAccess.CourseDao;
import odevler.hafta3.odev3.entities.Course;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void add(Course course){
        if (CourseValidator.isValid(course)){
            System.out.println("Kayıt Başarılı...");
            courseDao.add(course);
            for (Logger logger:loggers){
                logger.log(course.getName());
            }
        }else {
            System.out.println("Bilgileri Kontrol ediniz...");
        }
    }
}
