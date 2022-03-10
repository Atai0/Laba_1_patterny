package Zadanie6;

public abstract class SiemensMobile implements Mobile{
    String name;
    Integer number = 1312341234;
    Integer years = 2012;

    public Integer getYears() {
        return years;
    }
    String getName() {
        return name;
    }
    Integer getNumber() {
        return number;
    }
}