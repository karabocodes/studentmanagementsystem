package com.karabocodes.studentSystem.service;

import com.karabocodes.studentSystem.StudentSystemApplication;
import com.karabocodes.studentSystem.model.Student;

import java.util.List;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudents();

}
