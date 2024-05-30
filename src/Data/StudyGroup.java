package Data;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;

    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public List<Student> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Teacher: \n").append(teacher).append("\n\n");
        sb.append("Students: \n[");
        for (Student student : students) {
            sb.append(student).append("\n");
        }
        sb.append("]");
        return sb.toString();
    }
}
