package week1.day3;

public class primenumber {

	public static void main(String[] args) {
		int n=13,i                                     ;
		int count=0;
		for( i=1; i<=n; i++) {
		if(n%i==0) {
			count++;
		}
		}
		if(count==2)
		{
			System.out.println(" prime number");
		}
		else
		{
			System.out.println("Not a Prime number");
		}
	}

}
