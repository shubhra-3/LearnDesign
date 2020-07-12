package LearnDesign;


class Gear{
	
	int chainring; //number of teeth
	int cog; 
	double ratio, rim, tire; 

	Gear(int chainring, int cog, double rim, double tire){
		this.chainring = chainring;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
	}

	double getRatio() {
		ratio = (double)chainring/cog;
		return ratio;
	}

	double getgearInches() {
		double temp = ratio * (rim + (tire * 2));
		return temp;
	}

}

public class BicycleSystem{
	
	public static void main( String[] args ){
		
		Gear g1 = new Gear(20, 11, 26, 1.5);
		System.out.println("The ratio is " + g1.getRatio());
		System.out.println("The gear inches is " + g1.getgearInches());
	}
}

