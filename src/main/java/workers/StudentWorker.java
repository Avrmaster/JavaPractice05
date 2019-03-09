package workers;

import dao.StudentDAO;
import entities.Student;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentWorker {
    @Autowired
    private StudentDAO studentsDao;

    public void saveStudentToDb(Student student){
        if ((student!=null)&&(student.getPib()!=null)&&(!"".equals(student.getPib()))&&(student.getCourse()>0)){
            studentsDao.addStudent(student);
            System.out.println("Student have been saved "+student);
        }
    }
}
