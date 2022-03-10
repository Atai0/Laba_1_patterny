package Zadanie2;

public class StudentOfFaculty extends Student
{
    public StudentOfFaculty(String name)
    {
        this.name = name;
    }

    public void SayName()
    {
        System.out.println("Имя студента " + getName());
    }
}