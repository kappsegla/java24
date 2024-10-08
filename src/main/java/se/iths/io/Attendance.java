package se.iths.io;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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
        //Find attendance time for each person in minutes
        try {
            try (var lines = Files.lines(attendanceFile, StandardCharsets.UTF_16LE)) {
                //Find all unique names that has attended
                var persons = lines.skip(1)
                        .map(line -> line.split("\t"))
                        .map(PersonAttendance::of)
                        .collect(Collectors.toSet());
                persons.forEach(System.out::println);

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        //Hur länge har varje person varit ansluten


    }
}

record PersonAttendance(String name, ConnectionStatus status, LocalDateTime dateTime) {
    public static PersonAttendance of(String[] data) {
        ConnectionStatus status = ConnectionStatus.DISCONNECTED;
        if (data[1].equals("Ansluten"))
            status = ConnectionStatus.CONNECTED;

        return new PersonAttendance(data[0].replaceAll(" - .*$", ""),
                status,
                LocalDateTime.parse(data[2], DateTimeFormatter.ofPattern("yy-MM-dd HH:mm:ss")));
    }
}

enum ConnectionStatus {
    CONNECTED, DISCONNECTED
}
