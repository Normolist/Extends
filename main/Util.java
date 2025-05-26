package main;


public class Util {
    private Util() {
        System.out.println("Вызван конструктор утилитарного класса.");
    }

    public static String getLive(String o) {
        String result = "";
        switch (o) {
            case "GrandDad":
                System.out.println("Это вызвано инициализацией статической переменной деда.");
                result = "dead";
                break;
            case "Dad":
                System.out.println("Это вызвано инициализацией статической переменной отца.");
                result = "leave";
                break;
            default:
                System.out.println("Это вызвано инициализацией статической переменной сына.");
                result = "leave";
                break;
        }
        return result;

    }
}
