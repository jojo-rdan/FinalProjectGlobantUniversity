package org.globantUniversity.data;
import org.globantUniversity.data.teacher.Teacher;
import org.globantUniversity.data.teacher.TeacherFullTime;
import org.globantUniversity.data.teacher.TeacherPartTime;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Teacher> teachers = new ArrayList<Teacher>();
    private List<Student> students = new ArrayList<>();
    private List<Lesson> lessons = new ArrayList<>();
}
