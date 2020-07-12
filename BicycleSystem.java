package LearnDesign;


class Gear{
	
	int chainring; //number of teeth
	int cog; 
	double ratio; 
	Wheel w;

	Gear(int chainring, int cog, Wheel w){
		this.chainring = chainring;
		this.cog = cog;
		this.w = w;
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

		double temp = ratio * w.getDiameter();

		//but then there is still a problem
		//to calculate a wheel's dia is not the task of 
		//gear class
		//we need a separate wheel class(2)
		return temp;
	}

}

//3
//So here we intoduce a wheel class
class Wheel {

	double rim, tire;
	final double pi = (double)22/7;

	Wheel(double rim, double tire){
		this.rim = rim;
		this.tire = tire;
	}

	double getDiameter(){
		return (rim + ( tire * 2 ) );
	}

	double getCircumference(){
		return getDiameter() * pi;
	}

}

public class BicycleSystem{
	
	public static void main( String[] args ){
		
		Wheel w = new Wheel(26, 1.5);
		Gear g1 = new Gear(20, 11, w);
		System.out.println("The ratio is " + g1.getRatio());
		System.out.println("The gear inches is " + g1.getgearInches());
	}
}

