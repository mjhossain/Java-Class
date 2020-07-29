package quiz;

public class Siwawa extends Dog {
    private String hairLength;
    private boolean kidFriendly, dogFriendly;
    private String shedFrequency;

    public Siwawa() {
        super();
        this.setBreed("Siwawa");
        this.hairLength = "N/A";
        this.kidFriendly = false;
        this.dogFriendly = false;
        this.shedFrequency = "N/A";
    }

    public Siwawa(String hairLength, boolean kidFriendly, boolean dogFriendly, String shedFrequency, String color, int age) {
        super(color, age, "Siwawa");
        this.hairLength = hairLength;
        this.kidFriendly = kidFriendly;
        this.dogFriendly = dogFriendly;
        this.shedFrequency = shedFrequency;
    }

    // Setters

    public void setDogFriendly(boolean dogFriendly) {
        this.dogFriendly = dogFriendly;
    }

    public void setKidFriendly(boolean kidFriendly) {
        this.kidFriendly = kidFriendly;
    }

    public void setHairLength(String hairLength) {
        this.hairLength = hairLength;
    }

    public void setShedFrequency(String shedFrequency) {
        this.shedFrequency = shedFrequency;
    }

    // Getters

    public String getHairLength() {
        return hairLength;
    }

    public String getShedFrequency() {
        return shedFrequency;
    }

    public boolean isDogFriendly() {
        return dogFriendly;
    }

    public boolean isKidFriendly() {
        return kidFriendly;
    }

    // toString

    @Override
    public String toString() {
        return super.toString() + " Hair Length: " + this.hairLength + " Kid Friendly: " + this.kidFriendly +
                " Other Dog Friendly: " + this.dogFriendly + " Hair Shed Frequency: " + this.shedFrequency;
    }

    public boolean equals(Siwawa obj) {
        if(super.equals(obj) && (this.shedFrequency == obj.shedFrequency) && (this.dogFriendly == obj.dogFriendly)
        && (this.kidFriendly == obj.kidFriendly) && (this.hairLength == obj.hairLength)) {
            return true;
        } else {
            return false;
        }
    }
}
