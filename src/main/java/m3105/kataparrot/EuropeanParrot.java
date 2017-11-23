package m3105.kataparrot;

public class EuropeanParrot extends Parrot {

	public EuropeanParrot(ParrotTypeEnum _type, double voltage, boolean isNailed) {
		super(_type);
	}
	
	@Override
	public double getSpeed() {
		return this.BASE_SPEED;
	}

}
