package ru.itsjava.exsercises.excersise3;

import ru.itsjava.init.UniversityInitializer;
import ru.itsjava.model.Student;

import java.util.List;

public class FilterPractice2 {

    public static void main(String[] args) {
        List<Student> students = UniversityInitializer.initStudents();
        System.out.println(students);

//Методы бывают конвейрными(отложенными) и терминальными(энергичными)
//Какой метод filter и какой метод count?


    }
}
