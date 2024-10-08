package se.iths.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class ReadFromFile {
    public static void main(String[] args) {
        String path;
        if( System.getProperty("os.name").startsWith("Windows"))
            path = "c:/users/martin/java24/lecture2.pdf";
        else if(System.getProperty("os.name").startsWith("Mac"))
            path = "/home/martin/java24/lecture2.pdf";
        else
            path = "/home/martin/java24/lecture2.pdf";

        Path myPath = Path.of(System.getProperty("user.home"), "java24");
        Path currentPath = Path.of(System.getProperty("user.dir"));

        System.out.println(myPath);
        System.out.println(currentPath);

        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.arch"));
        System.out.println(System.getProperty("os.version"));

        //Does a path exist
        Path gitconfig = Path.of(System.getProperty("user.home"), ".gitconfig");
        System.out.println(Files.exists(gitconfig) ? ".gitconfig exists" : ".gitconfig not found");

        Path java24txt = Path.of(System.getProperty("user.home"), "java24.txt");
        System.out.println(Files.exists(java24txt) ? "java24.txt exists" : "java24.txt not found");


        try {
            Files.createFile(java24txt);
        } catch (IOException e) {
            System.out.println("Couldn't create file " + java24txt);
        }

        //Write to file, append preserves what's already there
        try {
            Files.writeString(java24txt, "Hello java åäö\n", StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Error writing to file " + java24txt);
        }


//        try {
//            Files.delete(java24txt);
//        } catch (IOException e) {
//            System.out.println("Couldn't delete file " + java24txt);
//        }






    }

}
