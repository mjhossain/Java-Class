package quiz;

public class Dog {
    private String species = "Canine", color, diet = "Carnivorous";
    private String breed;
    private int numOfLimbs = 4, age;
    boolean nocturnal = true;

    // Constructors
    public Dog() {
        this.color = "Not Defined";
        this.numOfLimbs = 0;
        this.age = 0;
        this.breed = "Not Defined";
    }

    public Dog(String color, int age, String breed) {
        this.color = color;
        this.age = age;
        this.breed = breed;
    }

    // Setters

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    //Getters

    public String getSpecies() {
        return species;
    }

    public String getColor() {
        return color;
    }

    public String getDiet() {
        return diet;
    }

    public int getNumOfLimbs() {
        return numOfLimbs;
    }

    public int getAge() {
        return age;
    }

    public boolean isNocturnal() {
        return nocturnal;
    }

    public String getBreed() {
        return breed;
    }

    // toString

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", color='" + color + '\'' +
                ", diet='" + diet + '\'' +
                ", numOfLimbs=" + numOfLimbs +
                ", age=" + age +
                ", nocturnal=" + nocturnal +
                '}';
    }

    // Equal
    public boolean equal(Dog obj) {
        if ((this.species == obj.species) && (this.color == obj.color) && (this.diet == obj.diet)
                && (this.numOfLimbs == obj.numOfLimbs) && (this.age == obj.age) && (this.nocturnal == obj.nocturnal)) {
            return true;
        } else {
            return false;
        }
    }
}
