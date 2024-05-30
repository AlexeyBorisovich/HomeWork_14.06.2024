import Controler.Controller;
import Data.StudyGroup;
import Data.Teacher;
import Data.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        // Создаю учителя
        Teacher teacher = new Teacher("999", "999", "999", "01.01.1980", 1);

        // Создаю студентов
        List<Student> students = new ArrayList<>();
        students.add(new Student("1", "1", "1", "01.01.2002", 101));
        students.add(new Student("2", "2", "2", "02.02.2001", 102));
        students.add(new Student("3", "3", "3", "03.03.2002", 103));
        students.add(new Student("4", "4", "4", "04.04.2001", 104));
        students.add(new Student("5", "5", "5", "05.05.2002", 105));
        students.add(new Student("6", "6", "6", "06.06.2001", 106));
        students.add(new Student("7", "7", "7", "07.07.2002", 107));

        // Формирую учебную группу
        StudyGroup studyGroup = controller.createStudyGroup(teacher, students);

        // Вывод информации о созданной учебной группе
        System.out.println("Teacher: \n" + studyGroup.getTeacher());
        
        System.out.println("Students: \n" + studyGroup.getStudents());
    }
}