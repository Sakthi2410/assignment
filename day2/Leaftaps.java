package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leaftaps {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	     ChromeDriver driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

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
  //  System.out.println(driver.findElement(null));
    WebElement source =driver.findElement(By.id("createLeadForm_dataSourceId"));
    Select dd1=new Select(source);
    dd1.selectByVisibleText("Employee");
    
    WebElement element = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
    Select dd2=new Select(element);
    dd2.selectByVisibleText("Automobile");
    
    WebElement element2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
    Select dd3=new Select(element2);
    dd3.selectByIndex(3);
    
    WebElement element3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
    Select dd4=new Select(element3);
    dd4.selectByValue("OWN_SCORP");
    
    WebElement element4 = driver.findElement(By.id("createLeadForm_currencyUomId"));
    Select dd5=new Select(element4);
    dd5.selectByValue("INR");
    
    driver.findElement(By.name("birthDate")).sendKeys("24/10/1998");
    driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vignesh");
    driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
    driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("9");
    driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9003492621");
    driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("seena");
    driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sakthivignesh24@gmail.com");
    driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("2545");
     driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("www.sakthi.com");
    driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Shivani");
    
    driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Sami Street");
     driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("chennai");
    driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600112");
    driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("45");
    driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Ramu");
    driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Choolai");
    WebElement element5 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
    Select dd6=new Select(element5);
    dd6.selectByValue("IND");
    WebElement element6 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
    Select dd7=new Select(element6);
    dd7.selectByVisibleText("TAMILNADU");
    
    driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("hiii");
    driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mr.");
    driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("the mass");
    driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000");
    driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("250");
    driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("St");
    driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("mechanical");
    driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("5");
    driver.findElement(By.id("createLeadForm_description")).sendKeys("hi i am sakthi");
    driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("i want sicere employee");
    driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("aaaa");
    driver.findElement(By.name("submitButton")).click();
    String val=driver.findElement(By.id("viewLead_firstName_sp")).getText();
    System.out.println(val);
    System.out.println(driver.getTitle());
    driver.close();


    

    


    
    
    
  
    


	}

}
