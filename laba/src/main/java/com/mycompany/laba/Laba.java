/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.laba;
import java.awt.Point;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * ©Vadik
 */

// Каталог автосалона
public class Laba{

    // Интерфейс автосалона
    public interface AutoInterface {

        public Integer getUnit();
        public Integer getAge();
        public String getColor();
        public String getBox();
        public String getEngine();
        public String getFuel();

        public void destructor();
    }

    // Дочерний класс 1
    public class Mazda implements AutoInterface
    {
        private Integer unit;
        private String color;
        private Integer age;
        private String box;
        private String engine;
        private String fuel;

        // Конструктор без параметров
        public Mazda(){
            this.unit = 1;
            this.color = "???";
            this.age = -1;
            this.box = "???";
            this.engine = "???";
            this.fuel = "???";
        }

        // Конструктор с параметрами
        public Mazda(Integer unit, String color,Integer age,String box, String engine, String fuel){
            this.unit = unit;
            this.color = color;
            this.age = age;
            this.box = box;
            this.engine = engine;
            this.fuel = fuel;
        }

        // Конструктор копирования
        public Mazda(Mazda mazda){
            this.unit = mazda.unit;
            this.color = mazda.color;
            this.age = mazda.age;
            this.box = mazda.box;
            this.engine = mazda.engine;
            this.fuel = mazda.fuel;
        }

        // Переопределение методов родителя
        @Override
        public Integer getUnit() {
            return unit;
        }
        
        @Override
        public Integer getAge() {
            return age;
        }

        @Override
        public String getColor() {
            return color;
        }

        @Override
        public String getBox() {
            return box;
        }

        @Override
        public String getEngine() {
            return engine;
        }

        @Override
        public String getFuel() {
            return fuel;
        }

        @Override
        public void destructor() {
            System.gc();
        }
    }

    // Дочерний класс 2
    public class Audi implements AutoInterface
    {
        private Integer unit;
        private String color;
        private Integer age;
        private String box;
        private String engine;
        private String fuel;

        // Конструктор без параметров
        public Audi(){
            this.unit = 2;
            this.color = "???";
            this.age = -1;
            this.box = "???";
            this.engine = "???";
            this.fuel = "???";
        }

        // Конструктор с параметрами
        public Audi(Integer unit, String color,Integer age,String box,String engine,String fuel){
            this.unit = unit;
            this.color = color;
            this.age = age;
            this.box = box;
            this.engine = engine;
            this.fuel = fuel;
        }

        // Конструктор копирования
        public Audi(Audi audi){
            this.unit = audi.unit;
            this.color = audi.color;
            this.age = audi.age;
            this.box = audi.box;
            this.engine = audi.engine;
            this.fuel = audi.fuel;

        }

        // Переопределение методов родителя
        @Override
        public Integer getUnit() {
            return unit;
        }

        @Override
        public Integer getAge() {
            return age;
        }

        @Override
        public String getColor() {
            return color;
        }

        @Override
        public String getBox() {
            return box;
        }

        @Override
        public String getEngine() {
            return engine;
        }

        @Override
        public String getFuel() {
            return fuel;
        }

        @Override
        public void destructor() {
            System.gc();
        }
    }


    // Рабочая область
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Scanner in = new Scanner(System.in);

        // Меню навигации
        System.out.println("Навигация:");
        System.out.println("(0) Покинуть каталог");
        System.out.println("(1) Дополнить");
        System.out.println("(2) Провести ревизию");
        int n = in.nextInt();

        // Просмотр каталога
        while(n!=0){
            // Добавление позиции
            if (n==1){
                int num = 3;
                while(num!=0){
                    System.out.println("Укажите марку поставки:");
                    System.out.println("(0) Отмена");
                    System.out.println("(1) Mazda");
                    System.out.println("(2) Audi");
                    num = in.nextInt();
                    // Mazda
                    if (num == 1)
                    {
                        int unit = num;
                        System.out.println("Укажите цвет авто:");
                        String color = in.next();
                        System.out.println("Укажите год выпуска:");
                        int age = in.nextInt();
                        System.out.println("Укажите тип коробки:");
                        String box = in.next();
                        System.out.println("Укажите привод:");
                        String engine = in.next();
                        System.out.println("Укажите тип топлива:");
                        String fuel = in.next();

                        Mazda mazda = new Laba().new Mazda(unit,color,age,box,engine,fuel);

                        System.out.println("\nДобавлена позиция:"+"\nMazda"+"\nгод выпуска: "+
                                mazda.getAge()+"\nцвет: " + mazda.getColor()+
                                "\nтип коробки: "+ mazda.getBox()+
                                "\nпривод: "+ mazda.getEngine()+
                                "\nтип топлива: "+ mazda.getFuel());
                        list.add(mazda);
                    }
                    // Audi
                    if (num == 2)
                    {
                        int unit = num;
                        System.out.println("Укажите цвет авто:");
                        String color = in.next();
                        System.out.println("Укажите год выпуска:");
                        int age = in.nextInt();
                        System.out.println("Укажите тип коробки:");
                        String box = in.next();
                        System.out.println("Укажите привод:");
                        String engine = in.next();
                        System.out.println("Укажите тип топлива:");
                        String fuel = in.next();

                        Audi audi = new Laba().new Audi(unit,color,age,box,engine,fuel);

                        System.out.println("\nДобавлена позиция:"+"\nAudi"+"\nгод выпуска: "+
                                audi.getAge()+"\nцвет: " + audi.getColor()+
                                "\nтип коробки: "+ audi.getBox()+
                                "\nпривод: "+ audi.getEngine()+
                                "\nтип топлива: "+ audi.getFuel());
                        list.add(audi);
                    }
                }
            }

            // Проведение ревизии
            if (n == 2){ // Проверка на наличие позиций
                if (list.size()==0)
                {System.out.println("Каталог пуст");}
                else { // Позиции есть, можно кого-нибудь убрать
                    printList1(list);
                    System.out.println("Кого требуется убрать? O_o");
                    System.out.println("(0) Если передумал.");
                    int code = in.nextInt();
                    if (code == 0) { // Или нет
                        System.out.println("Ладно.");
                    }
                    else if (code <= list.size()) { // Удаление нежелланых позиций
                        list.remove(code - 1);
                    }
                }
            }

            // Возвращение к навигации
            System.out.println("Сделай выбор:");
            System.out.println("(0) Покинуть");
            System.out.println("(1) Добавить позицию");
            System.out.println("(2) Провести ревизию");
            n = in.nextInt();
        }
    }

    //Вывод каталога
    public static void printList1(ArrayList<AutoInterface> list) {
        System.out.println("");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i+1+") ");
            if (list.get(i).getUnit()==1)
                System.out.println("Mazda");
            else if (list.get(i).getUnit()==2)
                System.out.println("Audi");
            System.out.println("Год выпуска: "+list.get(i).getAge());
            System.out.println("Цвет: "+list.get(i).getColor());
            System.out.println("Тип коробки передач: "+list.get(i).getBox());
            System.out.println("Привод: "+list.get(i).getEngine());
            System.out.println("Тип топлива: "+list.get(i).getFuel());
            System.out.println("");
        }}
}