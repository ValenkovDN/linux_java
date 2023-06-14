/**
 * Это класс Игрушка.
 */
public class A_toy {
    /** id игрушки*/
    private int id; //id игрушки

    /** Название игрушки*/
    private String title; // Название игрушки

    /** Количество игрушек*/
    private int quantity; // Колличество игрушек в аппарате

    /** Для изменения значения переменной quantity*/
    public int setQuantity(int quantity) {
        this.quantity = quantity;
        return quantity;
    }


    /** Конструктор класса Игрушка*/
    public A_toy(int id, String title, int quantity) {
        this.id = id;
        this.title = title;
        this.quantity = quantity;
    }

    /** Показывает знчение переменной title*/
    public String getTitle() {
        return title;
    }

    /** Показывает значение переменной quantity*/
    public int getQuantity() {
        return quantity;
    }

    /** Отформатированный вывод информации об игрушке*/
    @Override
    public String toString() {
        return String.format("id: %d; Название: %s; Колличество: %d", id, title, quantity);
    }
}
