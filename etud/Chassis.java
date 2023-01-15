package etud;
/** Représente le chassis d'une voiture. Classe de base à décorer... */
public class Chassis implements Voiture {

	private final float masse;
	private final float freinage;

	private final float acceleration;
	private final float prix;

	public Chassis(float masse, float freinage, float acceleration, float prix) {
		this.masse = masse;
		this.freinage = freinage;
		this.acceleration = acceleration;
		this.prix = prix;
	}
	@Override
	public float getFreinage() {
		return freinage;
	}

	@Override
	public float getAcceleration() {
		return acceleration;
	}

	@Override
	public float getMasse() {
		return masse;
	}



	@Override
	public float getPrix() {
		return prix;
	}
}
