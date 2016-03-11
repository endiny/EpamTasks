package com.epam.jc.task5;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import static com.epam.jc.task5.disciplines.Disciplines.*;

/**
 * @author Vladislav Boboshko
 */
public class StudentTest {

    @Test
    public void testStudent() throws Exception {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John Doe"));
        students.add(new Student("Alice"));
        students.add(new Student("Bob"));
        students.add(new Student("Mr. Pickles"));
        students.add(new Student("Chernushka"));
        students.add(new Student("Dmitro Karpachyov"));
        students.get(0).setGrade(5, ENGLISH);
        students.get(0).setGrade(3.4, OPTIMIZATIONS);
        students.get(1).setGrade(4, ENGLISH);
        students.get(2).setGrade(4.9, PHYSICS);
        students.get(5).setGrade(4.5, OPTIMIZATIONS);
        students.stream()
                .filter(a -> (int) a.getGrade(ENGLISH) != -1)
                .map(Student::getName)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        System.out.println();
        students.stream()
                .filter(a -> a.getGrade(OPTIMIZATIONS).intValue() != -1) //So dirty. Couldn't write anything better.
                .map(Student::getName)
                .collect(Collectors.toList())
                .forEach(System.out::println);

    }

    private void setGradesForStudent(Student student) {
        Random rand = new Random();
        student.setGrade(2+3*rand.nextDouble(), ENGLISH);
    }
}