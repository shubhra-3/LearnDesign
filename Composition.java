package LearnDesign;


class Bicycle {
	int size;
	Parts p;

	Bicycle( int size, Parts p) {
		this.size = size;
		this.p = p;
	}

	void spares() {
		p.spares();
	}
}


abstract class Parts {

	String chain;
	int tireSize;

	Parts(String chain, int tireSize) {
	 	this.chain = chain;
	 	this.tireSize = tireSize;
	}

	void spares(){
		System.out.println("TireSize " + tireSize);
		System.out.println("Chain " + chain);
	}

	int defaultTireSize();

	int defaultChain() {
		return "10-speed";
	}

}

class RoadBikeParts extends Parts {

	String chain;
	int tireSize;
	String tapeColor;

	RoadBikeParts(String chain, int tireSize, String tapeColor) {
		super(chain, tireSize);
		this.tapeColor = tapeColor;
	}

	void spares(){
		super.spares();
		System.out.println("TapeColor " + tapeColor);
	}

	int defaultTireSize(){
		return 23;
	}

}

class MountainBikeParts extends Parts {

	String chain;
	int tireSize;
	String frontShock, rearShock;

	MountainBikeParts(String chain, int tireSize, String frontShock, String rearShock) {
		super(chain, tireSize);
		this.frontShock = frontShock;
		this.rearShock = rearShock;
	}

	void spares(){
		super.spares();
		System.out.println("frontShock " + frontShock);
		System.out.println("rearShock " + rearShock);	
	}

	int defaultTireSize(){
		return 23;
	}

}

public class Composition{

	public static void main( String[] args) {

		MountainBikeParts m = new MountainBikeParts();
	}

}