package m3105.kataparrot;

public class AfricanParrot extends Parrot {

	private static final double LOAD_FACTOR = 9.0;
	private int numberOfCoconuts;

	public AfricanParrot(int numberOfCoconuts) {
		super();
		this.setNumberOfCoconuts(numberOfCoconuts);
	}

	public void setNumberOfCoconuts(int numberOfCoconuts) {
		if(numberOfCoconuts < 0) {
			throw new IllegalArgumentException("Un perroquet ne peut pas avoir moins de 0 noix de coco");
		}
		
		this.numberOfCoconuts = numberOfCoconuts;
	}

	@Override
	public double getSpeed() {
		return Math.max(0, this.BASE_SPEED - LOAD_FACTOR * this.numberOfCoconuts);		
	}
	
}
