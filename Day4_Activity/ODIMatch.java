public class ODIMatch extends Match {

	public ODIMatch() {
		super();
		
		
	}



	@Override
	float calculateRunRate() {
		
		return ((getTarget()-getCurrentScore())/(50-getCurrentOver()));
		
	}

	@Override
	float calculateBalls() {
	
		
		return 6*(50-getCurrentOver());
	}
	
	public void display()
	{
		System.out.println("Need "+(getTarget()-getCurrentScore())+" runs in "+(int)calculateBalls() + " balls");
		System.out.println("Required Runrate: "+calculateRunRate());
		
	}
}