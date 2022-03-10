package Zadanie5;

public class Музей extends ОбщественноеЗдание{
    public Музей(String name)
    {
        this.name = name;
    }
    public void Output()
    {
        System.out.println("Это - " + Name());
    }

}