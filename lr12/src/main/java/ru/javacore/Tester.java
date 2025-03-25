package ru.javacore;

public class Tester {
    private String name;
    private String surname;
    private int experienceInYears;
    private String englishLevel;
    private double salary;

    // Перегруженные конструкторы
    public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
        this.name = name;
        this.surname = surname;
        this.experienceInYears = experienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }

    public Tester(String name, String surname, int experienceInYears, String englishLevel) {
        this(name, surname, experienceInYears, englishLevel, 0.0); // вызываем другой конструктор
    }

    public Tester(String name, String surname) {
        this(name, surname, 0, "A1"); // вызываем другой конструктор
    }

    // Перегруженные методы
    public void introduce() {
        System.out.println("Я " + name + " " + surname);
    }

    public void introduce(String companyName) {
        System.out.println("Я работаю в " + companyName + ", а зовут меня " + name + " " + surname);
    }

    public void introduce(String greeting, String companyName) {
        System.out.println(greeting + ", я работаю в  " + companyName + ", а зовут меня " + name + " " + surname);
    }

    // Статический метод
    public static void printInfo(Tester tester) {
        System.out.println("Имя: " + tester.name);
        System.out.println("Фамилия: " + tester.surname);
        System.out.println("Опыт работы: " + tester.experienceInYears);
        System.out.println("Уровень английского языка: " + tester.englishLevel);
        System.out.println("Зарплата: " + tester.salary);
    }
}
