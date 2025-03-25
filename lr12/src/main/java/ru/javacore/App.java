package ru.javacore;

public class App {

    public static void main(String[] args) throws Exception {
        System.out.println( "Hello ВИКТОРИЯ!" );
        Tester tester1 = new Tester("Руслан", "Кузькин", 1, "А1", 2000.0);
        Tester tester2 = new Tester("Июнь", "Арех", 21, "B1", 9999.9);
        tester1.introduce();
        tester2.introduce("Disney");
        tester1.introduce("Хеллоу", "Nickelodeon");
        Tester.printInfo(tester1);
        Tester.printInfo(tester2);
    }
}
