package Zadanie14;

public abstract class РаботникФирмы {
    String type;
    String name;

    public void SayYourJob()
    {
        System.out.println("Я " + name + " и я " + type);
    }
}