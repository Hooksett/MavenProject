import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String args[]) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rajen\\Downloads\\chromedriver_win32\\chromedriver.exe\\");

		WebDriver d = new ChromeDriver();
		d.get("http://newtours.demoaut.com/");
		System.out.println("The title of the page is = " + d.getTitle());
		// d.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		d.findElement(By.name("userName")).sendKeys("Thapa");// name = userName

		d.findElement(By.name("password")).sendKeys("ABCD1234"); // name = password
		d.findElement(By.name("login")).click();

		// d.findElement(By.linkText("Thapa - Wikipedia")).click();// name = login
		// System.out.println("Title of the current page = "+ d.getCurrentUrl());
		// System.out.println("the title of page is ="+d.getTitle());
		// System.out.println(d.getPageSource());
		// d.

		// d.close();
		// Test

	}

}
