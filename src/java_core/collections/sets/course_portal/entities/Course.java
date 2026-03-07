package java_core.collections.sets.course_portal.entities;

import java.util.HashSet;
import java.util.Set;

public class Course {

    private String name;
    private Set<Student> students;

    public Course(String name) {
        this.name = name;
        this.students = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public Set<Student> getStudents (){
        return students;
    }
}
