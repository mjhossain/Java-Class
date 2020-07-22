package inheritence;

public class Triple extends Couple {
    private int z;

    public Triple() {
        super();
        this.z = 0;
    }

    public Triple(Couple c, int z) {
        super(c.getX(), c.getY());
        this.z = z;
    }

    public Triple(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }



    public int sum() {
        return super.sum() + this.z;
    }

    public int product() {
        return super.product() * this.z;
    }

    @Override
    public String toString() {
        return super.toString() + " Triple: " + z;
    }

    public boolean equals(Triple obj) {
        if(super.equals(obj) && this.z == obj.z){
            return true;
        } else {
            return false; 
        }
    }
}
