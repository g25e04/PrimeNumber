
public class Calculation {

	private int num;
	public Calculation() {
		// TODO Auto-generated constructor stub
	}

	public Calculation(int num) {
		setNum(num);
	}
	
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public boolean isPrime() {
		for(int divisor = 2;divisor <= getNum()/2;divisor++) {
			if(getNum() % divisor == 0) {
				return false;
			}
		}
				return true;
	}
	
	public String toString() {
		if (isPrime() && getNum()>=2)
			return "The number is prime number.";
		else
			return "The number isn't prime number.";
	}
}
