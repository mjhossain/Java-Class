package inheritance_2;

public class Eagle extends Animal {
    private String type;

    // Constructors
    public Eagle() {
        super();
        this.type = "Not Defined";
    }

    public Eagle(Animal animal, String type) {
        super(animal.getSpecies(), animal.getColor(), animal.getDiet(), animal.getSpeak(), animal.getNumOfLimbs(),
                animal.getAge(), animal.isNocturnal());
        this.type = type;
    }

    public Eagle(String species, String color, String diet, String speak, int numOfLimbs, int age, boolean nocturnal, String type) {
        super(species, color, diet, speak, numOfLimbs, age, nocturnal);
        this.type = type;
    }

    // Getter
    public String getType() {
        return type;
    }

    // Setter
    public void setType(String breed) {
        this.type = type;
    }

    // toString
    @Override
    public String toString() {
        return super.toString() + "\nType: " + this.type;
    }

    // equals
    public boolean equals(Eagle obj) {
        if(super.equals(obj) && this.type == obj.type) {
            return true;
        } else {
            return false;
        }
    }
}

