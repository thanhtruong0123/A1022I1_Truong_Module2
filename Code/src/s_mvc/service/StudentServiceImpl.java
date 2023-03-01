package s_mvc.service;

import s_mvc.model.Student;
import s_mvc.repository.StudentRepository;
import s_mvc.repository.StudentRepositoryImpl;

public class StudentServiceImpl implements StudentService{
    private StudentRepository repository = new StudentRepositoryImpl();

    @Override
    public Student[] findAll() {
        return repository.findAll();
    }

    @Override
    public void addStudent(Student student) {
        repository.addStudent(student);
    }
}
