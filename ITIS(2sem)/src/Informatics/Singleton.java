package Informatics;

/**
 * Created by User on 25.02.2017.
 */

// Шаблон Java Синглтон позволяет создавать единственный экземпляр класса.
// У класса есть только один экземпляр, и он предоставляет к нему глобальную точку доступа.

class Main {
    public static void main(String[] args) {
        final int SIZE = 1000;
        Singleton[] arr = new Singleton[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Singleton.getInstance();
        }

        System.out.println(Singleton.counter);
    }
}

public class Singleton {
    public static int counter;
    private static Singleton instance = null;

    private Singleton() {
        counter++;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
