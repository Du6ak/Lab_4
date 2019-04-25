package Lab_4.service;

import java.util.List;

import Lab_4.entity.Student;

public interface StudentService extends Service<Student> {

    List<Student> readByGroupId(Long groupId);

    List<Student> readBySurname(String surname);

}
