package Zadanie5;

import java.sql.SQLOutput;

public abstract class ОбщественноеЗдание implements Здание{

    String name;
    public void Build()
    {
        System.out.println("Здание найдено:");
    }
    protected String getName() {
        return name;
    }
    protected String Name() {
        return name;
    }
}