package job.model.attandance;

import java.util.ArrayList;
import java.util.List;

public class AttendanceGroup {

    private List<AttendanceVisitStudent> attendanceVisit = new ArrayList<>();

    public List<AttendanceVisitStudent> getAttendanceView() {
        return attendanceVisit;
    }

    public void addAttendanceVisit (AttendanceVisitStudent attendanceStudent){
        attendanceVisit.add(attendanceStudent);
    }

    @Override
    public String toString() {
        return "AttendanceGroup [attendanceView=" + attendanceVisit + "]";
    }
    
}
