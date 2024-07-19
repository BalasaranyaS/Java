package lab4;

interface Animal {
    void eat();
    void sleep();
}

interface Mammal extends Animal {
    void giveBirth();
}

interface Worker {
    void work();
}

class LivingBeing {
    void breathe() {
        System.out.println("Breathing...");
    }
}

class Human extends LivingBeing implements Mammal, Worker {
    @Override
    public void eat() {
        System.out.println("Human is eating...");
    }

    @Override
    public void sleep() {
        System.out.println("Human is sleeping...");
    }

    @Override
    public void giveBirth() {
        System.out.println("Human is giving birth...");
    }

    @Override
    public void work() {
        System.out.println("Human is working...");
    }
}

public class Main {
    public static void main(String[] args) {
        Mammal mammalRef = new Human();  // Step f
        mammalRef.eat();                 // Step g
        mammalRef.sleep();               // Step g
        mammalRef.giveBirth();           // Step g

        // To call methods from LivingBeing or Worker, we need to cast the reference
        ((Human) mammalRef).breathe();   // Step g, casting to call breathe
        ((Worker) mammalRef).work();     // Step g, casting to call work
    }
}

