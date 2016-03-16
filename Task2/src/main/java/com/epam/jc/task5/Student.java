package com.epam.jc.task5;

import com.epam.jc.task5.disciplines.Disciplines;

import java.util.Optional;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Vladislav Boboshko
 * Я не смог реализовать привязку типов к дисциплинам.
 * Как это грамотно можно сделать?
 */
public class Student {
    private Set<Subject> progress;
    private String name;

    public Student(String name) {
        this.name = name;
        progress = new TreeSet<>(new SortByDiscipline());
    }

    public Student() {
        this("Unnamed Student");
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getName() {

        return name;
    }

    public <T extends Number> Student addSubject(Disciplines discipline, T grade) {
        progress.add(new Subject(grade, discipline));
        return this;
    }

    public Number getGrade(Disciplines discipline) {
        Optional<Subject> tmp = progress.stream().filter(a -> a.getDisciplines() == discipline).findAny();
        if (tmp.isPresent()) {
            return tmp.get().getGrade();
        } else {
            return -1;
        }
    }

    public <T extends Number> Student setGrade(T grade, Disciplines discipline) {
        progress.removeIf(a -> a.getDisciplines() == discipline);
        progress.add(new Subject(grade, discipline));
        return this;
    }
}

