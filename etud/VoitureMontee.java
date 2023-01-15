package etud;

public abstract class VoitureMontee implements Voiture {
    private final Voiture wrapper;

    public VoitureMontee(Voiture wrapper) {
        super();
        this.wrapper = wrapper;
    }

    @Override
    public float getMasse() {
        return wrapper.getMasse();
    }

    @Override
    public float getFreinage() {
        return wrapper.getFreinage();
    }

    @Override
    public float getAcceleration() {
        return wrapper.getAcceleration();
    }

    @Override
    public float getPrix() {
        return wrapper.getPrix();
    }
}

