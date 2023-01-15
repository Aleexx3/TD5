package etud;

public class VoitureFreinsDisque extends VoitureMontee {

    public VoitureFreinsDisque(Voiture wrapper) {
        super(wrapper);
    }

    @Override
    public float getMasse() {
        return 0;
    }


    @Override
    public float getAcceleration() {
        return 0;
    }

    @Override
    public float getPrix() {
        return 0;
    }

    @Override
    public float getFreinage() {
        return super.getFreinage() + 150;
    }
}
