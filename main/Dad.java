package main;
//20250527

import static main.Util.getLive;

public class Dad extends GrandDad {
    static String leaveStatus = getLive("Dad");
    private String name = getName2();

    static {
        System.out.println("Статический блок инициализации отца");
    }

    {
        System.out.println("Объектный блок инициализации отца");
    }

    private String getName2() {
        System.out.println("Объектная переменная отца создана.");
        return "Dad";
    }

    public Dad() {
        System.out.println("Отцовский конструктор вызван");

    }
}

