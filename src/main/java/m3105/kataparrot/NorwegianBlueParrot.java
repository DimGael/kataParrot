package m3105.kataparrot;

public class NorwegianBlueParrot extends Parrot {

	private static final double MIN_SPEED = 24.0;
	private double voltage;
	private boolean isNailed;

	public NorwegianBlueParrot(ParrotTypeEnum _type, double voltage, boolean isNailed) {
		super(_type);
		this.voltage = voltage;
		this.isNailed = isNailed;
	}

	@Override
	public double getSpeed() {
		return (this.isNailed) ? 0 : getBaseSpeed(voltage);
	}
	
	private double getBaseSpeed(double voltage) {
		return Math.min(MIN_SPEED, voltage * BASE_SPEED);
	}
}
