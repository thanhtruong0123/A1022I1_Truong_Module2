package s_mvc.repository;

import s_mvc.model.Student;

public interface StudentRepository {
    /*CRUD*/
    Student[] findAll();

    void addStudent(Student student);
}
