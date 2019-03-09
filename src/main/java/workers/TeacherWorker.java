package workers;

import dao.TeacherDAO;
import entities.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public class TeacherWorker {
    @Autowired
    private TeacherDAO teachersDao;

    public Teacher addTeacher(Teacher teacher) {
        teachersDao.addTeacher(teacher);
        System.out.println("Teacher has been added " + teacher);
        return teacher;
    }

    public Teacher getTeacherById(int id) {
        return teachersDao.getTeacherById(id);
    }

    public void saveTacher(Teacher teacher) {
        teachersDao.saveTeacher(teacher);
        System.out.println("Teacher has been saved " + teacher);
    }
}