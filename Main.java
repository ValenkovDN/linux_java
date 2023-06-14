import java.io.IOException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {
        Game.list();
        while ((Game.n != 4) && (Game.user.getBalance() != 0)){
            Game.game();
        }
    }
}
