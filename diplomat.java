package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class diplomat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\Users\\rajen\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://spicejet.com/");
		Select s = new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_group_details']")));
		s.selectByValue("1");
		s.selectByIndex(2);
		s.selectByVisibleText("6 Adults");

	}

}
