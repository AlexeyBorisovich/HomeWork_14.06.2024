package Service;

import Data.StudyGroup;
import Data.Teacher;
import Data.Student;

import java.util.List;

public class TrainingGroupService {
    public StudyGroup formStudyGroup(Teacher teacher, List<Student> students) {
        return new StudyGroup(teacher, students);
    }
}