package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents () {
        Student st1 = new Student("Garanin Nikolai", 2, 6.5);
        Student st2 = new Student("Garanina Oksana", 5, 8.5);
        Student st3 = new Student("Garanin Semen", 1, 9.5);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents () {
        System.out.println("Начало работы метода getStudents");
        System.out.println(students.get(3));
        System.out.println("Information from metod getStudents");
        System.out.println(students);
        System.out.println("---------------------------------------");
        return students;
    }
}
