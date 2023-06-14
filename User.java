import java.util.Scanner;

/** Класс пользователь*/
public class User {

    /** Баланс пользователя*/
    private int balance;

    /** Конструктор класса Пользователь*/
    User() {
        this.balance = balance;
    }

    /** Показывает знчение переменной balance*/
    public int getBalance() {
        return balance;
    }

    /** Для изменения значения переменной balance*/
    public void setBalance(int balance) {
        this.balance = balance;
    }

    /** Отформатированный вывод информации о состоянии баланса пользователя*/
    @Override
    public String  toString() {
        if (balance > 10) System.out.printf("Баланс игрока: %d р. ", balance);
        if (balance == 10) System.out.printf("У вас заканчиваются деньги. Пополните баланс.\n" +
                "Баланс игрока: %d р. ", balance);
        if (balance == 0) System.out.printf("Вы потратили все деньги. Баланс : %d р. ", balance);
        return " ";
    }

    /** Для выбора пользователем пункта меню*/
    public int number (){
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        return number;
    }

    /** Для пополнения пользователем баланса*/
    public String replenish(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Внесите деньги: ");
        int number = scan.nextInt();
        balance += number;
        return "Баланс пополнен на " + number + "р.";
    }
}
