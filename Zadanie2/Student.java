package Zadanie2;

import java.util.Random;

public abstract class Student implements Abiturient
{
    String name;

    Random rand = new Random();
    int id = rand.nextInt(1,99);
    int k = rand.nextInt(1,5);

    public String getName() {
        return name;
    }

    public void Id() {
        System.out.println("ID студента - " + id);
    }
    public void Course() {
        System.out.println("Курс студента - " + k);
    }
}