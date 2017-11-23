package m3105.kataparrot;

public class AfricanParrot extends Parrot {

	private int numberOfCoconuts;

	public AfricanParrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
		super(_type, voltage, isNailed);
		this.setNumberOfCoconuts(numberOfCoconuts);
	}

	public void setNumberOfCoconuts(int numberOfCoconuts) {
		if(numberOfCoconuts < 0) {
			throw new IllegalArgumentException("Un perroquet ne peut pas avoir moins de 0 noix de coco");
		}
		
		this.numberOfCoconuts = numberOfCoconuts;
	}
	
	public int getNumberOfCoconuts() {
		return this.numberOfCoconuts;
	}

	@Override
	public double getSpeed() {
		return Math.max(0, 12.0 - 9.0 * this.numberOfCoconuts);		
	}
	
}
