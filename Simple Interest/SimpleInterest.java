class SimpleInterest {
	public static void main (String [] args) {
		/*Simple Interest Program
		SI = P*R*T
		P: Prinicpal Amount
		R: Rate of Interest
		T: Time period
		*/
		
		float amount = 15000;
		float rate = 0.04f; //Interest if 4%
		int timePeriod = 5; //asuming 5 years
		
		float simpleInterest = amount * rate * timePeriod;
		
		System.out.println("Interest:" + simpleInterest);
	}
}