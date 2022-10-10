package odevler.hafta3.odev3;

import odevler.hafta3.odev3.business.CourseManager;
import odevler.hafta3.odev3.business.InstructorManager;
import odevler.hafta3.odev3.core.logging.DatabaseLogger;
import odevler.hafta3.odev3.core.logging.FileLogger;
import odevler.hafta3.odev3.core.logging.Logger;
import odevler.hafta3.odev3.dataAccess.HibernateCourseDao;
import odevler.hafta3.odev3.dataAccess.JdbcInstructorDao;
import odevler.hafta3.odev3.entities.Course;
import odevler.hafta3.odev3.entities.Instructor;

public class Main {
    public static void main(String[] args){
        Logger[] loggers={new DatabaseLogger(),new FileLogger()};


        Course course=new Course(1,"Java ","deneme ","denemeCat","burak",10);
        CourseManager courseManager=new CourseManager(new HibernateCourseDao(),loggers);
        courseManager.add(course);



        /*
        Instructor instructor=new Instructor(1,"Burak ","Full-Stack" );
        InstructorManager instructorManager=new InstructorManager(new JdbcInstructorDao(),loggers);
        instructorManager.add(instructor);

         */

    }
}
