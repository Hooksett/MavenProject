package mercuryTours;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterNewUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	     System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajen\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
			
			WebDriver d= new ChromeDriver();
			d.get("http://newtours.demoaut.com/");
			System.out.println("The title of the page is = "+ d.getTitle());
			
		
			d.findElement(By.linkText("REGISTER")).click();
			
			d.findElement(By.name("firstName")).sendKeys("ThapaABC");
			d.findElement(By.name("lastName)")).sendKeys("12345");
			d.findElement(By.name("phone")).sendKeys("67565900");
			d.findElement(By.id("userName")).sendKeys("dog_mail");
			d.findElement(By.name("address1")).sendKeys("Jawalakhel");
			d.findElement(By.name("city")).sendKeys("Lalitpur");
			d.findElement(By.name("state")).sendKeys("Bagmati");
		    d.findElement(By.name("postalCode")).sendKeys("12345");
		    d.findElement(By.name("country")).sendKeys("Nepal");
		    
		    d.findElement(By.name("email")).sendKeys("Thapa");
		    d.findElement(By.name("password)")).sendKeys("1234567");
		    d.findElement(By.name("confirmPassword")).sendKeys("1234567");
		    
		    d.findElement(By.name("register")).click();
		    
		    
		    
			
			
			
			
			

	}

}
