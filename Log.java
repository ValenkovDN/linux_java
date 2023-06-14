import java.io.*;
import java.util.logging.FileHandler;

/** Класс log. Для работы с файлами*/
public class Log {

    /** Создает запись в файл*/
    public static void writer(String a) throws IOException {
        FileWriter writer = new FileWriter("note.txt", true);
        writer.write(a);
        writer.append('\n');
        writer.flush();
    }

    /** Считывает содержимой файла и выводит на экран.*/
    public static void reader() throws IOException {
        FileReader reader = new FileReader("note.txt");
        int c;
        while((c=reader.read())!=-1){
            System.out.print((char)c);
        }
    }
}
