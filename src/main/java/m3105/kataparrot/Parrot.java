package m3105.kataparrot;
public class Parrot {

	protected static final double BASE_SPEED = 12.0;
	
	private ParrotTypeEnum type;

	public Parrot(ParrotTypeEnum _type) {
		this.type = _type;
	}

	public double getSpeed() {
		switch (type) {
		case EUROPEAN:
			throw new RuntimeException("Should be unreachable");
		case AFRICAN:
			throw new RuntimeException("Should be unreachable");
		case NORWEGIAN_BLUE:
		}
		throw new RuntimeException("Should be unreachable");
	}

}