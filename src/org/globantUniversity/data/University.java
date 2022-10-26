package org.globantUniversity.data;
import org.globantUniversity.data.teacher.TeacherFullTime;
import org.globantUniversity.data.teacher.TeacherPartTime;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<TeacherFullTime> teachersFullTime = new ArrayList<>();
    private List<TeacherPartTime> teachersPartTime = new ArrayList<>();
    private List<Student> students = new ArrayList<>();
    private List<Lesson> lessons = new ArrayList<>();
}
