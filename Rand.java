import java.util.Random;

/** Класс Random*/
public class Rand {

    /** Генерация случайного числаа в заданном диапазоне*/
    public static int rand(int a){
        Random random = new Random();
        return random.nextInt(a);
    }
}
