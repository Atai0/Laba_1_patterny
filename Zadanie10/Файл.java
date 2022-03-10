package Zadanie10;

public class Файл extends Директория {
    String name;

    public Файл(String name)
    {
        this.name = name;
    }

    public void Information(){
        System.out.println("Путь к файлу: " + getDirectoryName() + name);
    }
}