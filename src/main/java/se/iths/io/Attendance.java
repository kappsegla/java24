package se.iths.io;

import java.nio.file.Files;
import java.nio.file.Path;

public class Attendance {
    public static void main(String[] args) {

        //Kolla om attendancefilen finns
        Path attendanceFile = Path.of("meetingAttendanceList.csv");
        if (Files.exists(attendanceFile)) {
            System.out.println("Found attendance file");
        }
        else {
            System.out.println("Attendance file not found");
            return;
        }

        //Läsa alla rader från filen



        //Hitta alla unika namn som närvarat

        //Hur många unika personer har närvarat

        //Hur länge har varje person varit ansluten






    }
}
