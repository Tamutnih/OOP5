package job;

import job.model.attandance.AttendanceGroup;
import job.model.attandance.AttendanceVisitStudent;
import job.model.students.Student;
import job.model.students.StudentGroup;
import job.presenter.Presenter;
import job.view.controller.*;

public class Main {

    public static void main(String[] args) {
        // Creating Student objects
        Student Иван = new Student("Иван", 1);
        Student Маша = new Student("Маша", 1);
        Student Петр = new Student("Петр", 1);

        StudentGroup studentGroupOneCourse = new StudentGroup();
        // Adding students to a group of students
        studentGroupOneCourse.addStudentInGroup(Иван);
        studentGroupOneCourse.addStudentInGroup(Маша);
        studentGroupOneCourse.addStudentInGroup(Петр);

        // Creating an object about visiting students
        AttendanceVisitStudent attendanceVisitingИван = new AttendanceVisitStudent(Иван);
        AttendanceVisitStudent attendanceVisitingМаша = new AttendanceVisitStudent(Маша);
        AttendanceVisitStudent attendanceVisitingПетр = new AttendanceVisitStudent(Петр);
        // list of student visits
        attendanceVisitingМаша.addVisiting("19-12-2022", true);
        attendanceVisitingМаша.addVisiting("20-12-2022", true);
        attendanceVisitingМаша.addVisiting("21-12-2022", true);
        attendanceVisitingМаша.addVisiting("22-12-2022", true);
        attendanceVisitingМаша.addVisiting("23-12-2022", true);
        attendanceVisitingМаша.addVisiting("24-12-2022", true);
        attendanceVisitingМаша.addVisiting("25-12-2022", true);

        attendanceVisitingПетр.addVisiting("19-12-2022", false);
        attendanceVisitingПетр.addVisiting("20-12-2022", false);
        attendanceVisitingПетр.addVisiting("21-12-2022", false);
        attendanceVisitingПетр.addVisiting("22-12-2022", false);
        attendanceVisitingПетр.addVisiting("23-12-2022", false);
        attendanceVisitingПетр.addVisiting("24-12-2022", false);
        attendanceVisitingПетр.addVisiting("25-12-2022", true);

        attendanceVisitin(Иван).addVisiting("19-12-2022", true);
        attendanceVisitin(Иван).addVisiting("20-12-2022", false);
        attendanceVisitin(Иван).addVisiting("21-12-2022", true);
        attendanceVisitin(Иван).addVisiting("22-12-2022", true);
        attendanceVisitin(Иван).addVisiting("23-12-2022", true);
        attendanceVisitin(Иван).addVisiting("24-12-2022", false);
        attendanceVisitin(Иван).addVisiting("25-12-2022", true);

        AttendanceGroup attendanceGroupOneCourse = new AttendanceGroup();

        attendanceGroupOneCourse.addAttendanceVisit(attendanceVisitin(Иван));
        attendanceGroupOneCourse.addAttendanceVisit(attendanceVisitingПетр);
        attendanceGroupOneCourse.addAttendanceVisit(attendanceVisitingМаша);

        ControllerAttendanceGroup controllerGroup = new ControllerAttendanceGroup(attendanceGroupOneCourse);

        // work of Presenter -one button for all commands
        Presenter presenter = new Presenter(controllerGroup, studentGroupOneCourse);
        presenter.button_start_all_command();
    }
}