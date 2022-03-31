package model;

import java.util.*;

public class StudentDB {
    //private Student[] students;
    //private List<Student> students;

    private Map<Integer, Student> students;


    public StudentDB() {
        students = new HashMap<>();
    }

    public Map<Integer, Student> getAllStudents() {
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

    public void add(Student student)  {
        students.put(student.getStudentId(), student);
    }

    public void remove(Student student) {
        students.remove(student.getStudentId());
    }


    /*
    public boolean removeByIndex(int index) {
        for (int i = 0; i < students.size(); i++) {
            //students.get(i)
        }
        return false;
    }*/
}
