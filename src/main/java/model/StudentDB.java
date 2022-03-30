package model;

import java.util.ArrayList;
import java.util.Arrays;

public class StudentDB {
    //private Student[] students;
    private ArrayList<Student> students = new ArrayList<>();

    public StudentDB(ArrayList<Student> students) {
        this.students = students;
    }

    public ArrayList<Student> getAllStudents() {
        if (students.size() > 0) {
            return students;
        }
        return null;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }

    public Student randomStudent() {
        int studentIndex = (int) (Math.random() * (students.size()));
        return students.get(studentIndex);
    }

    public boolean add(Student student) {
        if (!students.contains(student)) {
            return students.add(student);
        }
        return false;
    }

    public Student remove(Student student) {
        if (students.contains(student)) {
            return student;
        } else
            return null;
    }
    /*
    public boolean removeByIndex(int index) {
        for (int i = 0; i < students.size(); i++) {
            //students.get(i)
        }
        return false;
    }*/
}
