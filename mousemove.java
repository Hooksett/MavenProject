package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mousemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajen\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Actions a= new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[2]"))).build().perform();
		
		//WebElement move=driver.findElement(By.);

	}

}

