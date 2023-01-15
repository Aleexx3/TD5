package etud;

public class VoitureMoteurEssence extends VoitureMontee {

    public VoitureMoteurEssence(Voiture wrapper) {
        super(wrapper);
    }

    @Override
    public float getFreinage() {
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
    public float getMasse() {
        return super.getMasse() + 300;
    }
}
