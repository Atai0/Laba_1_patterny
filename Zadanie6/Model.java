package Zadanie6;

public class Model extends SiemensMobile{
    public Model(String name)
    {
        super();
        this.name = name;
        this.years = years;
    }
    public void ModelName()
    {
        System.out.println("Имя модели - " + getName());
        System.out.println("Номер модели - " + getNumber());
        System.out.println("Год выпуска модели - " + getYears());

    }

}

