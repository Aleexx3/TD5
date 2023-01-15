package etud;

public class Adaptateur implements Voiture {

    ChassisAnglais chassisAnglais;

    public Adaptateur(ChassisAnglais chassisAnglais) {
        this.chassisAnglais = chassisAnglais;
    }

    @Override
    public float getMasse() {
        return chassisAnglais.getMass();
    }

    @Override
    public float getFreinage() {
        return chassisAnglais.getBrake();
    }

    @Override
    public float getAcceleration() {
        return chassisAnglais.getAccelerate();
    }

    @Override
    public float getPrix() {
        return chassisAnglais.getPrice();
    }
}
