package main;

import static main.Util.getLive;

public class GrandDad {

    static String leaveStatus = getLive("GrandDad");
    private String name = getName2();

    static {
        System.out.println("Статический блок инициализации деда");
    }

    {
        System.out.println("Объектный блок инициализации деда");
    }

    private String getName2() {
        System.out.println("Объектная переменная деда создана.");
        return "GrandDad";
    }

    public GrandDad() {
        System.out.println("Дедовский конструктор вызван");

    }
}
