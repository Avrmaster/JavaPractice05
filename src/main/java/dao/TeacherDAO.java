package dao;


import entities.Teacher;

public interface TeacherDAO {
    void addTeacher(Teacher teacher);
    Teacher getTeacherById(int id);
    void saveTeacher(Teacher teacher);
}
