package exercise;




import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calendarhandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajen\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.path2usa.com/travel-companions");
		driver.findElement(By.xpath(".//*[@id='travel_date']")).click();
		//driver.findElement(By.className("day")).click();
		List <WebElement>dates =driver.findElements((By.className("day")));
		driver.findElements(By.className("day")).size();
		int count=driver.findElements(By.className("day")).size();
		for(int i=0;i<count;i++)
		{
			String text=driver.findElements(By.className("day")).get(i).getText();
			if(text.equalsIgnoreCase("16"))
				
			{
				driver.findElements(By.className("day")).get(i).click();
				break;
			}
		}
		
		

	}

}
