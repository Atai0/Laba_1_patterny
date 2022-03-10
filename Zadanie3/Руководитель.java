package Zadanie3;

public class Руководитель extends Инженер
{
    public Руководитель(String name)
    {
        this.name = name;
    }

    public void Number() {
        System.out.println("Номер сотрудника - " + number);
    }
}