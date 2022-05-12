package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {
	public static void main(String[] args) {
     WebDriverManager.chromedriver().setup();
     ChromeDriver driver=new ChromeDriver();
     driver.get("https://en-gb.facebook.com/");
     driver.manage().window().maximize();
     
     driver.findElement(By.id("email")).sendKeys("sakthivignesh24@gmail.com");
     driver.findElement(By.id("pass")).sendKeys("Leomessi24");
     driver.findElement(By.name("login")).click();
     driver.close();
     
     
	}
}