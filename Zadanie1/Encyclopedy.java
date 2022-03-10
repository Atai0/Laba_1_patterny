package Zadanie1;

public class Encyclopedy extends Book
{
    public Encyclopedy(String name)
    {
        this.name = name;
    }

    public void Display()
    {
        System.out.println("Эта книга - " + getName());
    }
}