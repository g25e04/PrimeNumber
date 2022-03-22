
public class Detect {

	private int num;
	
	public Detect() {
		// TODO Auto-generated constructor stub
	}

	public Detect(int num) {
		setNum(num);
		
	}
	
	
	public int getNum() {
		return num;
	}
	
	public void setNum(int num) {
		this.num = num;
	}
	
	public boolean Detection() {
		boolean status;
		if(getNum() <= 2) {
			status = false;
			return status;
		}
		else {
			status = true;
			return status;
		}	
	}
	
	public String toString() {
		if(Detection()==false)
			return "The number must be greater or equal to 2,please input positive integer.";
		else
			return "Input correct.";
	}
}
