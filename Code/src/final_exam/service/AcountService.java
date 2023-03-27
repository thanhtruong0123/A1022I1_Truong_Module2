package final_exam.service;

import java.io.IOException;

public interface AcountService {
    void addNew() throws IOException;
    void delete() throws IOException;
    void display() throws IOException;
    void search();
}
