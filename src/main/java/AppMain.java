import model.Student;
import model.StudentDB;

import java.time.LocalDate;
import java.util.ArrayList;

public class AppMain {
    public static void main(String[] args) {
        String firstStudentName = "Anton";
        LocalDate firstBirthdate = LocalDate.of(1974, 05, 30);
        int firstID = 1234;
        String firstEmail = "anton@email.de";

        Student anton = new Student(firstStudentName, firstID);

        String secondStudentName = "Pedro";
        LocalDate secondBirthdate = LocalDate.of(1978, 12, 11);
        Integer secondId = 2346;
        String secondEmail = "pedro@email.de";

        Student pedro = new Student(secondStudentName, secondId);

        String thirdStudentName = "Marcel";
        LocalDate thirdBirthdate = LocalDate.of(2000, 05, 18);
        Integer thirdId = 1256;
        String thirdEmail = "marcel@email.de";

        Student marcel = new Student(thirdStudentName, thirdId);

        // Student Array
        Student[] students = new Student[] {anton, pedro, marcel};

        // Student ArrayList
        ArrayList<Student> studentsArrayList = new ArrayList<>();
        studentsArrayList.add(anton);
        studentsArrayList.add(pedro);
        studentsArrayList.add(marcel);



        StudentDB stDB = new StudentDB(studentsArrayList);

        System.out.println(stDB.toString());

        Student ana = new Student("ana", 987);
        System.out.println(stDB.add(ana));

        System.out.println(stDB.toString());
    }
}
