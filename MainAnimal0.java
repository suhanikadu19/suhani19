abstract class Animal {

    abstract void sound();
}

class Lion extends Animal {

    @Override
    void sound() {
        System.out.println("Lion roars: Roooaaarrr!");
    }
}

class Tiger extends Animal {

    @Override
    void sound() {
        System.out.println("Tiger growls: Grrrrrr!");
    }
}

public class MainAnimal0 {

    public static void main(String[] args) {

        // Creating objects
        Animal lion = new Lion();
        Animal tiger = new Tiger();

        // Calling sound()
        lion.sound();
        tiger.sound();

        // Polymorphism using array
        Animal[] animals = {lion, tiger};

        for (Animal a : animals) {
            a.sound();
        }
    }
}