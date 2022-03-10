package Zadanie16;

public abstract class СадовоеДерево {
    Integer number;
    Integer age;
    Integer plodonoshenie;

    public Integer getNumber() {
        return number;
    }

    public void Inf()
    {
        if (age > 10 && plodonoshenie < 3)
        {
            System.out.println("дерево стоит пересадить в связи с его возрастом и плодоношением");
        }
        else if (age < 10 && plodonoshenie < 3)
        {
            System.out.println("дерево стоит пересадить в связи с плодоношением");
        }
        else if (age > 10 && plodonoshenie > 3)
        {
            System.out.println("дерево стоит пересадить в связи с его возрастом");
        }
        else
        {
            System.out.println("с деревом всё впорядке");
        }
    }
}