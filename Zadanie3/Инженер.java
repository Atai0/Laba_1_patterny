package Zadanie3;

import java.util.Random;

public class Инженер implements Сотрудник
{
    String name;

    Random rand = new Random();
    int number = rand.nextInt(1,99);
    int age = rand.nextInt(25,55);
    public Инженер(String name)
    {
        this.name = name;
        this.age=age;
    }

    public Инженер() {}

    public void Name()
    {
        System.out.println("Имя сотрудника " + getName());
    }
    public void Age()
    {
        System.out.println("Возраст сотрудника " + age);
    }

    public String getName() {
        return name;
    }


    public void Number() {
        System.out.println("Номер сотрудника - " + number);
    }
}