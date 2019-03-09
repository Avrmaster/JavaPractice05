import entities.Student;
import entities.Teacher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import workers.StudentWorker;
import workers.TeacherWorker;

import java.util.Date;

public class Application{
    public static void main( String[] args ){
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        StudentWorker worker =
                (StudentWorker) context.getBean("worker");
        Student testStudent = new Student("Sasha Leskiv", 3);
        worker.saveStudentToDb(testStudent);

        TeacherWorker workWithTeacher =
                (TeacherWorker) context.getBean("teachersWorker");
        Teacher teacher = new Teacher("Hello", "World", new Date(), "+380675097865");
        teacher = workWithTeacher.addTeacher(teacher);
        teacher.setCellphone("+380111111111");
        workWithTeacher.saveTacher(teacher);
    }
}