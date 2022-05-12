package Day1.week1;

public class bike {
int noOfWheels=2;
short noOfMirrors=2;
long chassisNumber=458948642L;
boolean isPunctured=true;
String bikeName="KTM";
double runningKM=11250.325;
public static void main(String[] args) {
	bike obj=new bike();
	
	System.out.println(obj.noOfWheels);
	System.out.println(obj.noOfMirrors);
	System.out.println(obj.chassisNumber);
	System.out.println(obj.bikeName);
	System.out.println(obj.runningKM);
	System.out.println(obj.isPunctured);
}
}
