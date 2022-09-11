package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 WebDriverManager.chromedriver().setup(); 
			
			ChromeDriver driver=new ChromeDriver(); 
			 driver.get("http://leaftaps.com/opentaps/control/main");
			 driver.manage().window().maximize();
			 driver.findElement(By.id("username")).sendKeys("Demosalesmanager")	;
			 driver.findElement(By.id("password")).sendKeys("crmsfa");
			 driver.findElement(By.className("decorativeSubmit")).click();
			 driver.findElement(By.linkText("CRM/SFA")).click();
			 driver.findElement(By.linkText("Leads")).click();
			 driver.findElement(By.linkText("Create Lead")).click();
			 driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Krisopia");
			 driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Priyanka");
			 driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Nagaraj");
			 driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Priya");
			 driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
			 driver.findElement(By.id("createLeadForm_description")).sendKeys("Nice to learn new chapters");
			 driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("priyanka.nagaraj6@gmail.com");
			 WebElement source = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
			Select dd = new Select (source);
			dd.selectByValue("NY");
			Thread.sleep(3000);
			driver.findElement(By.name("submitButton")).click();
			String title = driver.getTitle();
			System.out.println("heading"+ title);

	}

}
