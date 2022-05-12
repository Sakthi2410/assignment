package week1.day4;

public class Sumofdigit {
	public static void main(String[] args) {
		int input = 6541, sum = 0;
		while (input > 0) {
			int rem = input % 10;
			sum = sum + rem;
			input = input / 10;

		}
		System.out.println(sum);

	}

}
