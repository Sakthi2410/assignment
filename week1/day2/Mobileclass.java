package week1day2;

public class Mobileclass {
	public void sendMessage() {
		System.out.println("Hi I am Sakthi");
	}
	public void shareDocument() {
		System.out.println("Share Document in the github");
	}
public void call(){
	System.out.println("call my number");
}
public static void main(String[] args) {
	Mobileclass m=new Mobileclass();
	m.call();
	m.shareDocument();
	m.sendMessage();
}
}
