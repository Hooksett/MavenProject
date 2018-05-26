package exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajen\\Downloads\\chromedriver_win32\\chromedriver.exe\\");
		WebDriver driver=new ChromeDriver();
		
		
		/*driver.get("https://www.qatarairways.com/en/homepage.html/");
		driver.findElement(By.xpath("//*[@id=\"j-main-nav-list\"]/li[1]/a")).click();
		driver.get("https://www.studentuniverse.com/");
		driver.findElement(By.cssSelector(" ul.nav.navbar-nav.navbar-left > li:nth-child(1) > a")).click();
		driver.findElement(By.xpath("(//SPAN[@ng-bind='text'][text()='Activities'][text()='Activities'])[1]")).click();*/
		driver.get("http://spicejet.com/");
		Select s= new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
		s.selectByValue("4");
		s.selectByIndex(1);
		s.selectByVisibleText("8");
		
		driver.findElement(By.xpath("//INPUT[@id='ctl00_mainContent_ddl_originStation1_CTXT']/self::INPUT")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).sendKeys(Keys.TAB);
		
		//driver.findElement(By.xpath("//INPUT[@id='ctl00_mainContent_ddl_originStation1_CTXT']/self::INPUT,[2]")).click();
		driver.findElement(By.xpath("//a[@value='DEL']")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_view_date1']]")).click();
		
		
		driver.findElement(By.xpath("//INPUT[@id='ctl00_mainContent_chk_Unmr']")).click();
		//System.out.println(driver.findElement(By.xpath("//INPUT[@id='ctl00_mainContent_chk_Unmr']")).isSelected());
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr[4]/td[1]/a")).click();
		
		
		
		
		
		
		/*driver.findElement(By.xpath("//*[@id='view_fulldate_id_1']")).click();
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	    Select s1= new Select(driver.findElement(By.xpath("//*[@value='DEL']")));
	    s1.selectByVisibleText("DEL");
		Select s11= new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")));
		s11.selectByVisibleText("JAI");*/
		 
		 
		

		
		
		

	}

}
