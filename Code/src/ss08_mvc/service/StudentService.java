package ss08_mvc.service;

import ss08_mvc.model.Student;

public interface StudentService {
    //CRUD, sort, search
    Student[] findAll();

    void addStudent(Student student);

    //Validation

}
