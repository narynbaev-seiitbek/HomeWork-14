package HomeWorks;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Sadyr","President");
        System.out.print("Person information:"+'\n'+person);
        person.learn();
        person.walk();
        person.eat();

        System.out.println();

        Programmer programmer = new Programmer("Bill","Programmer","Microsoft");
        System.out.print(programmer);
        programmer.eat();
        programmer.walk();
        programmer.learn();
        programmer.coding();

        System.out.println();

        Dancer dancer = new Dancer("Atai","Dancer","Tumar");
        System.out.print(dancer);
        dancer.eat();
        dancer.learn();
        dancer.walk();
        dancer.dancing();

        System.out.println();

        Singer singer = new Singer("Nik","Singer","Backstreet Boys");
        System.out.print(singer);
        singer.eat();
        singer.learn();
        singer.walk();
        singer.singing();




    }
}
