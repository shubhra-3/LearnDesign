package LearnDesign;


class Gear{
	
	int chainring; //number of teeth
	int cog; 
	double ratio; 

	Gear(int chainring, int cog){
		this.chainring = chainring;
		this.cog = cog;
	}

	double getRatio(){
		ratio = (double)chainring/cog;
		return ratio;
	}


}

public class BicycleSystem{
	
	public static void main( String[] args ){
		
		Gear g1 = new Gear(20, 11);
		System.out.println("The ratio is " + g1.getRatio());
	}
}