package etud;

public class ChassisAnglais {

    private final float mass;

    private final float price;

    private final float accelerate;

    private final float brake;

    public ChassisAnglais(float mass, float price, float accelerate, float brake) {
        this.mass = mass;
        this.price = price;
        this.accelerate = accelerate;
        this.brake = brake;
    }

    public float getBrake() {
        return brake;
    }

    public float getMass() {
        return mass;
    }

    public float getPrice() {
        return price;
    }

    public float getAccelerate() {
        return accelerate;
    }



}
