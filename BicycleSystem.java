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
		//double temp = ratio * (rim + (tire * 2));
		//we should support single responsibilty
		//why do gear inches need to claculate diameter
		// so

		double temp = ratio * getDiameter();

		//but then there is still a problem
		//to calculate a wheel's dia is not the task of 
		//gear class
		//we need a separate wheel class
		return temp;
	}

	double getDiameter(){
		return (rim + ( tire * 2 ) );
	}

}

public class BicycleSystem{
	
	public static void main( String[] args ){
		
		Gear g1 = new Gear(20, 11, 26, 1.5);
		System.out.println("The ratio is " + g1.getRatio());
		System.out.println("The gear inches is " + g1.getgearInches());
	}
}

