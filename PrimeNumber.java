import java.util.Scanner;
public class PrimeNumber {

	public PrimeNumber() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Please imput positive integer to detect whether it's prime number.");
		int number = sc.nextInt();
		Detect D1 = new Detect(number);
		System.out.println(D1.toString());
		Calculation C1 = new Calculation(number);
		C1.isPrime();
		System.out.println(C1.toString());
	}

}
