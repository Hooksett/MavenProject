package exercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waittime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajen\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?");
		driver.findElement(By.id("H-destination")).sendKeys("city of New York");
		//driver.findElement(By.id("package-destination")).sendKeys("NewHampshire");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-destination")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='967211']/div[2]/div/a")).click();
		WebDriverWait d=new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='17117062']/div[2]/div/a")));
		//driver.findElement(By.xpath("//*[@id='17117062']/div[2]/div/a"));
		
		

	}

}
