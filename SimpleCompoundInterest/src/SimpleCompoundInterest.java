
public class SimpleCompoundInterest {
	
	/*
	 * @param principle
	 * @param rateOfInterest
	 * @param time
	 * @returns double simple interest computed
 	*/
	public double SimpleInterest(float principle, float rateOfInterest, float time) {
		return (principle*rateOfInterest*time)/100;
	}
	
	
	/*
	 * @param principle
	 * @param rateOfInterest
	 * @param time
	 * @returns double compound interest computed
 	*/
	public double CompoundInterest(float principle, float rateOfInterest, float time) {
		return principle * Math.pow((1+rateOfInterest)/100, time);
	}
	
}
