package inheritance_2;

public class Animal {
    private String species, color, diet, speak;
    private int numOfLimbs, age;
    boolean nocturnal;

    // Constructors
    public Animal() {
        this.species = "Not Defined";
        this.color = "Not Defined";
        this.diet = "Not Defined";
        this.speak = "Not Defined";
        this.numOfLimbs = 0;
        this.age = 0;
        this.nocturnal = false;
    }

    public Animal(String species, String color, String diet, String speak, int numOfLimbs, int age, boolean nocturnal) {
        this.species = species;
        this.color = color;
        this.diet = diet;
        this.speak = speak;
        this.numOfLimbs = numOfLimbs;
        this.age = age;
        this.nocturnal = nocturnal;
    }

    // Setters

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public void setSpeak(String speak) {
        this.speak = speak;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumOfLimbs(int numOfLimbs) {
        this.numOfLimbs = numOfLimbs;
    }

    public void setNocturnal(boolean nocturnal) {
        this.nocturnal = nocturnal;
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

    public String getSpeak() {
        return speak;
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

    // toString

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", color='" + color + '\'' +
                ", diet='" + diet + '\'' +
                ", speak='" + speak + '\'' +
                ", numOfLimbs=" + numOfLimbs +
                ", age=" + age +
                ", nocturnal=" + nocturnal +
                '}';
    }

    // Equal
    public boolean equal(Animal obj) {
        if ((this.species == obj.species) && (this.color == obj.color) && (this.diet == obj.diet) && (this.speak == obj.speak)
        && (this.numOfLimbs == obj.numOfLimbs) && (this.age == obj.age) && (this.nocturnal == obj.nocturnal)) {
            return true;
        } else {
            return false;
        }
    }
}
