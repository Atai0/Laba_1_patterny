package com.company;


import Zadanie1.Encyclopedy;
import Zadanie1.Handbook;
import Zadanie10.Файл;
import Zadanie11.Автомобиль1;
import Zadanie11.Грузоперевозчик;
import Zadanie11.Поезд;
import Zadanie11.Самолет;
import Zadanie12.Студент;
import Zadanie12.Учащийся;
import Zadanie12.Школьник;
import Zadanie13.Духовой;
import Zadanie13.МузыкальныйИнструмент;
import Zadanie13.Струнный;
import Zadanie13.Ударный;
import Zadanie14.*;
import Zadanie15.ДомашнееЖивотное;
import Zadanie15.Кошка;
import Zadanie15.Попугай;
import Zadanie15.Собака;
import Zadanie16.Вишня;
import Zadanie16.СадовоеДерево;
import Zadanie16.Слива;
import Zadanie16.Яблоня;
import Zadanie2.StudentOfFaculty;
import Zadanie3.Инженер;
import Zadanie3.Руководитель;
import Zadanie3.Сотрудник;
import Zadanie4.Колледж;
import Zadanie4.Университет;
import Zadanie5.Музей;
import Zadanie5.Театр;
import Zadanie6.Model;
import Zadanie7.Авианосец;
import Zadanie8.Нейрохирург;
import Zadanie8.Хирург;
import Zadanie9.ГрузовойКорабль;
import Zadanie9.Танкер;

public class Main
{
    public static void main(String[] args)
    {
//        //ЗАДАНИЕ 1
//
//        Handbook handbook = new Handbook("Справочник по русскому языку");
//        handbook.Display();
//        Encyclopedy encyclopedy = new Encyclopedy("Энциклопедия для детей");
//        encyclopedy.Display();
//
//
////        ЗАДАНИЕ 2
//
//        StudentOfFaculty student1 = new StudentOfFaculty("Atai");
//        student1.SayName();
//        student1.Id();
//        student1.Course();
//
//
//
//     //   ЗАДАНИЕ 3
//
//        Сотрудник руководитель = new Руководитель("Atai");
//        руководитель.Name();
//        руководитель.Number();
//        руководитель.Age();
//        Сотрудник инженер = new Инженер("Erjan");
//        инженер.Name();
//        инженер.Number();
//        инженер.Age();
//
//
//  //      ЗАДАНИЕ 4
//
//        Колледж колледж = new Колледж("Политехнический колледж");
//        колледж.Number();
//        колледж.Name();
//        Университет университет = new Университет("КГТУ");
//        университет.Number();
//        университет.Name();
//
//
//    //    ЗАДАНИЕ 5
//
//        Театр театр = new Театр("Театр");
//        театр.Build();
//        театр.Output();
//        Музей музей = new Музей("Музей");
//        музей.Build();
//        музей.Output();
//
//      //  ЗАДАНИЕ 6
//
//        Model model = new Model("A51");
//        model.ModelName();
//
//
//
//      //  ЗАДАНИЕ 7
//
//        Авианосец корабль1 = new Авианосец();
//        корабль1.Выстрелить();
//        корабль1.ВыпуститьРакету();
//
//
//     //   ЗАДАНИЕ 8
//
//        Хирург врач1 = new Хирург();
//        Хирург врач2 = new Нейрохирург();
//        врач1.ShowType();
//        врач2.ShowType();
//
//
//     //   ЗАДАНИЕ 9
//
//        ГрузовойКорабль танкер1 = new ГрузовойКорабль();
//        ГрузовойКорабль танкер2 = new Танкер();
//        танкер1.ПеревезтиГруз();
//        танкер2.ПеревезтиГруз();
//
//
//      //  ЗАДАНИЕ 10
//
//        Файл файл = new Файл("Main.java");
//        файл.Information();
//
//
//
//     //   ЗАДАНИЕ 11
//
//        Автомобиль1 автомобиль2 = new Автомобиль1("Москва", "Бишкек");
//        Самолет самолет2 = new Самолет("Ош", "Бишкек");
//        Поезд поезд2 = new Поезд("Талас", "Балыкчы");
//        Грузоперевозчик Array1[] = {автомобиль2,самолет2,поезд2};
//        for (int i = 0; i < Array1.length; i++)
//        {
//            Array1[i].SetPrice();
//            Array1[i].Show();
//
//        }
//
//      //  ЗАДАНИЕ 12
//
//        Школьник школьник1 = new Школьник("Рамазан", "Школьник", 1122);
//        Школьник школьник2 = new Школьник("Эржан", "Школьник", 1212);
//        Студент студент1 = new Студент("Атай", "Студент", 1234);
//        Учащийся Array2[] = {школьник1,студент1,школьник2};
//        for (int i = 0; i < Array2.length; i++)
//        {
//            if (Array2[i].getType() == "Школьник")
//            {
//                System.out.println("Этот учащийся - " + Array2[i].getType() + " и его имя - " + Array2[i].getName());
//            }
//        }
//        for (int i = 0; i < Array2.length; i++)
//        {
//            if (Array2[i].getType() == "Студент")
//            {
//                System.out.println("Этот учащийся - " + Array2[i].getType() + " и его имя - " + Array2[i].getName());
//            }
//        }
//
//
//       // ЗАДАНИЕ 13
//
//        Духовой флейта = new Духовой();
//        Струнный скрипка = new Струнный();
//        Ударный барабаны = new Ударный();
//        МузыкальныйИнструмент Array3[] = {флейта,скрипка,барабаны};
//        System.out.println("Состав оркестра");
//        for (int i = 0; i < Array3.length; i++)
//        {
//            Array3[i].Sound();
//        }
//
//
//
//      //  ЗАДАНИЕ 14
//
//        Тестировщик тестировщик = new Тестировщик("Эржан", "Тестировщик");
//        Программист программист = new Программист("Атай", "Программист");
//        Менеджер менеджер = new Менеджер("Рамазан", "Менеджер");
//        Дизайнер дизайнер = new Дизайнер("Нурсултан", "Дизайнер");
//        Аналитик аналитик = new Аналитик("Эрбол", "Аналитик");
//        РаботникФирмы Array4[] = {тестировщик,программист,менеджер,дизайнер,аналитик};
//        for (int i = 0; i < Array4.length; i++)
//        {
//            Array4[i].SayYourJob();
//        }
//
//
//    //    ЗАДАНИЕ 15
//
//        Попугай попугай = new Попугай("Гриша", 5);
//        Собака собака = new Собака("Рекс", 3);
//        Кошка кошка = new Кошка("Барс", 9);
//        ДомашнееЖивотное Array5[] = {кошка,собака,попугай};
//        for (int i = 0; i < Array5.length; i++)
//        {
//            Array5[i].Information();
//        }
//
//
//    //    ЗАДАНИЕ 16
//
//        Вишня вишня = new Вишня(1,13,2);
//        Слива слива = new Слива(2,8, 2);
//        Яблоня яблоня = new Яблоня(3,14,5);
//        Вишня вишня1 = new Вишня(4,5,5);
//        СадовоеДерево Array6[] = {вишня,слива,яблоня,вишня1};
//        for (int i = 0; i < Array6.length; i++)
//        {
//            System.out.print("Дерево под номером " + Array6[i].getNumber() + ", ");
//            Array6[i].Inf();
//        }

    }
}