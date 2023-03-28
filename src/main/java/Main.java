import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        creatFile();
        getFileInfo();
        readFile();
    }

    public static void creatFile(){
        File file = new File("/Users/nevzat/Documents/newFile/students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu. ");
            } else {
                System.out.println("Dosya zaten var.");
            }
        } catch (IOException e) {
            System.out.println("Hata oluştu.");
            e.printStackTrace();
        }
    }

    public static void getFileInfo(){
        File file = new File("/Users/nevzat/Documents/newFile/students.txt");
        if (file.exists()){
            System.out.println("File Name : " + file.getName());
            System.out.println("File Path :" + file.getAbsolutePath());
            System.out.println("File size : " + file.length());
            System.out.println("File can write? : " + file.canWrite());
            System.out.println("File can read? :" + file.canRead());
        }

    }


    public static void readFile(){
        File file = new File("/Users/nevzat/Documents/newFile/students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }
}
