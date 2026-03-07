package java_core.collections.sets.course_portal.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Instructor {

    private Integer id;
    private List<Course> courses;

    public Instructor(Integer id) {
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public int totalStudentCount(){
        Set<Student> allUniqueStudents = new HashSet<>();

        for(Course course : this.courses){
            allUniqueStudents.addAll(course.getStudents());
        }
        return allUniqueStudents.size();
    }
}
