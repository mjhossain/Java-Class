package inheritance_2;

public class Dog extends Animal {
    private String breed;

    // Constructors
    public Dog() {
        super();
        this.breed = "Not Defined";
    }

    public Dog(Animal animal, String breed) {
        super(animal.getSpecies(), animal.getColor(), animal.getDiet(), animal.getSpeak(), animal.getNumOfLimbs(),
        animal.getAge(), animal.isNocturnal());
        this.breed = breed;
    }

    public Dog(String species, String color, String diet, String speak, int numOfLimbs, int age, boolean nocturnal, String breed) {
        super(species, color, diet, speak, numOfLimbs, age, nocturnal);
        this.breed = breed;
    }

    // Getter
    public String getBreed() {
        return breed;
    }

    // Setter
    public void setBreed(String breed) {
        this.breed = breed;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "\nBreed: " + this.breed;
    }

    // equals
    public boolean equals(Dog obj) {
        if(super.equals(obj) && this.breed == obj.breed) {
            return true;
        } else {
            return false;
        }
    }
}
