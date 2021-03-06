package com.patryk_michal.electronicgradebook.postgressConnection.student;

import com.patryk_michal.electronicgradebook.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
    Student findStudentByLogin(String login);
}
