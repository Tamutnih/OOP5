package job.model.attandance;

import java.util.LinkedHashMap;
import java.util.Map;

import job.model.students.Student;

public class AttendanceVisitStudent {
    private Student student;
    private Map<String, Boolean> visit;

    public AttendanceVisitStudent(Student student) {
        this.student = student;
        this.visit = new LinkedHashMap<>();
    }

    public Map<String, Boolean> getVisit() {
        return visit;
    }

    public Student getStudent() {
        return student;
    }

    public void addVisiting(String date, Boolean visiting) {
        visit.put(date, visiting);
    }

    public void printVisit(Student student) {
        System.out.println(student + "\n" + getVisit());
    }

    @Override
    public String toString() {
        return "AttendanceServise [student=" + student + ", lst=" + visit + "]";
    }
}