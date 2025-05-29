package Oops.IO._1_CreatingFile;
import java.io.*;
public class LaunchFile2 {
    public static void main(String[] args) throws IOException
    {
        File dir = new File("SAM");
        System.out.println(dir.isDirectory());
        System.out.println("Absolute Path: " + dir.getAbsolutePath());

        boolean created = dir.mkdir();
        System.out.println(created);

        System.out.println(dir.isDirectory());
    }
}
