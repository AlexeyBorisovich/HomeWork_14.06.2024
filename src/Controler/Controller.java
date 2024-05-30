package Controler;

import Data.StudyGroup;
import Data.Teacher;
import Data.Student;
import Service.TrainingGroupService;

import java.util.List;

public class Controller {
    private final TrainingGroupService trainingGroupService = new TrainingGroupService();

    public StudyGroup createStudyGroup(Teacher teacher, List<Student> students) {
        return trainingGroupService.formStudyGroup(teacher, students);
    }
}