package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class editcommand {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
	     ChromeDriver driver=new ChromeDriver();
	 	driver.get("http://leaftaps.com/opentaps/control/main")	;
		driver.manage().window().maximize();
	    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	    driver.findElement(By.linkText("CRM/SFA")).click();
	    driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.linkText("Create Lead")).click();
	    driver.findElement(By.className("inputBox")).sendKeys("shreeji");
	    driver.findElement(By.id("createLeadForm_firstName")).sendKeys("sakthi");
	    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("vignesh");
	    driver.findElement(By.name("submitButton")).click();
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.id("updateLeadForm_companyName")).clear();
driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Zoho");
driver.findElement(By.name("submitButton")).click();
driver.close();


		


	}

}
