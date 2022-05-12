package week1.day4;

public class ArmstrongNumber {
public static void main(String[] args) {
	int rem,input=370,sum=0;

	 
	int total=input;
	while(input>0)
	{
		 rem = input % 10;
		sum=sum+(rem*rem*rem);
		input=input/10;
	}
	if (sum==total) {
		System.out.println("its amstrong number");
	}
	else
	{
		System.out.println("it is not a amstrong number");
	}
}
}
