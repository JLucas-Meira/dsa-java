package java_core.collections.sets.course_portal.entities;

import java.util.Objects;

public class Student {
    private Integer id;

    public Student(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(id, student.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
