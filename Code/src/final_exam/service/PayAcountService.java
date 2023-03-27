package final_exam.service;

import java.io.IOException;

public interface PayAcountService extends AcountService{
    @Override
    void addNew() throws IOException;

    @Override
    void delete() throws IOException;

    @Override
    void display() throws IOException;

    @Override
    void search();
}
