package java_core.collections.sets.course_portal.application;

import java_core.collections.sets.course_portal.entities.Course;
import java_core.collections.sets.course_portal.entities.Instructor;
import java_core.collections.sets.course_portal.entities.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Instructor intructorAlex = new Instructor(321);
        Course courseA = new Course("A");
        Course courseB = new Course("B");
        Course courseC = new Course("C");

        readStudentsForCourse(sc, courseA);
        courseA.getStudents();
        readStudentsForCourse(sc, courseB);
        readStudentsForCourse(sc, courseC);

        intructorAlex.addCourse(courseA);
        intructorAlex.addCourse(courseB);
        intructorAlex.addCourse(courseC);

        int total = intructorAlex.totalStudentCount();
        System.out.print("Total students: " + total);

        sc.close();
    }

    public static void readStudentsForCourse(Scanner sc, Course course){
        System.out.print("How many students for course " + course.getName() + "?");
        int n = sc.nextInt();
        for(int i=0; i<n; i++){
            int id = sc.nextInt();
            Student student = new Student(id);
            course.addStudent(student);
        }
    }

}
