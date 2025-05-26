package Main;

import static Main.Util.getLive;

public class Son extends Dad {

    static String leaveStatus = getLive("Sun");
    private String name = getName2();

    static {
        System.out.println("Статический блок инициализации сына");
    }

    {
        System.out.println("Объектный блок инициализации сына");
    }

    private String getName2() {
        System.out.println("Объектная переменная сына.");
        return "Sun";
    }

    public Son() {
        System.out.println("Конструктор сына вызван");


    }

}
