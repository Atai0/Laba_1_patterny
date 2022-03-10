package Zadanie11;

public abstract class Грузоперевозчик {
    Integer price;
    Integer time;
    String name1;
    String name2;

    public void SetPrice()
    {
        if (name1 == "Москва" && name2 == "Бишкек")
        {
            time = 12;
            price = 22000;
        }
        else if (name1 == "Ош" && name2 == "Бишкек")
        {
            time = 3;
            price = 3000;
        }
        else
        {
            time = 15;
            price = 5000;
        }
    }

    public void Show()
    {
        System.out.println("Стоимость поездки: " + price);
        System.out.println("Время: " + time + "часов");
    }
}