package se.iths.io;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Collectors;

public class Attendance {
    public static void main(String[] args) {

        //Kolla om attendancefilen finns
        Path attendanceFile = Path.of("meetingAttendanceList.csv");
        if (Files.exists(attendanceFile)) {
            System.out.println("Found attendance file");
        } else {
            System.out.println("Attendance file not found");
            return;
        }

        try {
            try (var lines = Files.lines(attendanceFile, StandardCharsets.UTF_16LE)) {
                //Find all unique names that has attended
                var persons = lines.skip(1)
                        .map(line -> line.split("\t")[0])
                        //.map(name -> name.substring(0, !name.contains(" - ") ? name.length() : name.indexOf(" - ")))
                        .map(name -> name.replaceAll(" - .*$", ""))
                        .collect(Collectors.toSet());
                System.out.println("Number of attendances: " + persons.size());
                persons.forEach(System.out::println);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Hur många unika personer har närvarat

        //Hur länge har varje person varit ansluten


    }
}
