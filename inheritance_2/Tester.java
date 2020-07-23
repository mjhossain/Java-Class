package inheritance_2;

public class Tester {
    public static void main(String[] args) {
        Animal newAnimal = new Animal();
        Dog dog = new Dog("Canine", "Brown", "Carnivorus", "Wof Wof", 4, 10, false, "Chiwawa");
        Eagle eagle = new Eagle("Bird", "Black", "Carnivorus", "Queeek", 2, 17, false, "Hostile");


        newAnimal.setAge(5);
        newAnimal.setColor("Ginger");
        newAnimal.setSpecies("Cat");
        newAnimal.setDiet("Carnivorous");
        newAnimal.setNumOfLimbs(4);
        newAnimal.setSpeak("Meow Meow");
        newAnimal.setNocturnal(false);


        System.out.println("---------------DOG--------------");
        System.out.println(dog.toString());
        System.out.println("--------------BIRD--------------");
        System.out.println(eagle.toString());
        System.out.println("--------------CAT---------------");
        System.out.println(newAnimal.toString());
    }
}
