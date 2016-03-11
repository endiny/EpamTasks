package com.epam.jc.task5;

import com.epam.jc.task5.disciplines.Disciplines;

import java.util.Comparator;

/**
 * @author Vladislav Boboshko
 */
public class Subject<T extends Number> {
    public T getGrade() {
        return grade;
    }

    public Disciplines getDisciplines() {
        return disciplines;
    }

    public Subject(T grade, Disciplines disciplines) {
        this.grade = grade;
        this.disciplines = disciplines;
    }

    public void setGrade(T grade) {

        this.grade = grade;
    }

    private T grade;
    private Disciplines disciplines;
}

class SortByDiscipline implements Comparator<Subject> {

    @Override
    public int compare(Subject o1, Subject o2) {
        return o1.getDisciplines().ordinal() - o2.getDisciplines().ordinal();
    }
}