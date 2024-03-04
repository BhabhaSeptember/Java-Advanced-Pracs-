package com.example;

public class PetMain {

    public static void main(String[] args) {
//        Animal a;
//        //test a spider with a spider reference
//        Spider s = new Spider();
//        s.eat();
//        s.walk();
//        //test a spider with an animal reference
//        a = new Spider();
//        a.eat();
//        a.walk();

//        Cat c = new Cat("Tom");
//        c.eat();
//        c.walk();
//        c.play();
//
//
//        Animal a;
//        a = new Cat();
//        a.eat();
//        a.walk();
//
//
//        Pet b;
//        b = new Cat();
//        b.play();
//
//
//        Pet p;
//        p = new Cat();
//        p.setName("Garfield");
//        p.play();
//
//
//        Fish f = new Fish();
//        f.setName("Glook");
//        f.eat();
//        f.walk();
//        f.play();
//
//



//        Animal a;
//        a = new Fish();
//        a.walk();
//        a.eat();
//
//
//        Pet p;
//        p = new Fish();
//        p.play();
//
//
System.out.println("-------Play With Animal? Test-------");
Animal s = new Spider();
playWithAnimal(s);

Animal c = new Cat();
playWithAnimal(c);

Animal f = new Fish();
playWithAnimal(f);
    }

    public static void playWithAnimal(Animal a) {
        // completed in practice
        if (a instanceof Pet) {
            Pet p = (Pet)a;
            p.play();
        } else {
            System.out.println("Alert: Dangerous Wild Animal, stay away!");
        }
    }

}
