import model.Student;
import model.StudentDB;

import java.time.LocalDate;
import java.util.HashMap;

public class AppMain {
    public static void main(String[] args) {
        String firstStudentName = "Anton";
        LocalDate firstBirthdate = LocalDate.of(1974, 05, 30);
        int firstID = 1234;
        String firstEmail = "anton@email.de";

        String secondStudentName = "Pedro";
        LocalDate secondBirthdate = LocalDate.of(1978, 12, 11);
        Integer secondId = 2346;
        String secondEmail = "pedro@email.de";

        String thirdStudentName = "Marcel";
        LocalDate thirdBirthdate = LocalDate.of(2000, 05, 18);
        Integer thirdId = 1256;
        String thirdEmail = "marcel@email.de";

        Student anton = new Student(firstStudentName, firstID);
        Student pedro = new Student(secondStudentName, secondId);
        Student marcel = new Student(thirdStudentName, thirdId);

        StudentDB stDB = new StudentDB();
        stDB.add(anton);
        stDB.add(pedro);
        stDB.add(marcel);
        System.out.println(stDB.toString());

        Student ana = new Student("ana", 987);
        stDB.add(ana);
        System.out.println(ana.getName() + " wurde hinzugefügt!\n" + stDB.toString());
        stDB.remove(pedro);
        System.out.println(stDB.toString());
    }
}
