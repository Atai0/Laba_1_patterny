package Zadanie4;

import java.util.Random;

public class Колледж implements УчебноеЗаведение
{
    String name;
    Random rand = new Random();
    int number = rand.nextInt(1,99);

    public Колледж() {
    }

    public void Number() {
        System.out.println("Номер колледжа - " + number);
    }
    public void Name()
    {
        System.out.println("Название учебного заведения - " + getName());
    }
    public String getName() {
        return name;
    }
    public Колледж(String name)
    {
        this.name = name;
    }
}