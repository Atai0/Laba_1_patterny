package Zadanie1;

public class Handbook extends Book
{
    public Handbook(String name)
    {
        this.name = name;
    }

    public void Display()
    {
        System.out.println("Эта книга - " + getName());
    }
}