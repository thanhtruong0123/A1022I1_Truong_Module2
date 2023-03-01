package s_mvc.service;

import s_mvc.model.Student;

public interface StudentService {
    //CRUD, sort, search
    Student[] findAll();

    void addStudent(Student student);

    //Validation

}
