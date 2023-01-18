package job.model.students;

import java.util.ArrayList;
import java.util.List;

public class StudentGroup {
    private List<Student> students = new ArrayList<>();

    public List<Student> getStudents() {
        return students;
    }

    public void addStudentInGroup(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "StudentGroup [students=" + students + "\n]";
    }

}