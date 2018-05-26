import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rajen\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		System.out.println("The title of the page is = " + d.getTitle());
		d.findElement(By.className("gsfi")).sendKeys("Thapa");
		d.findElement(By.className("gsfi")).sendKeys(Keys.ENTER);
		d.findElement(By.linkText("Thapa - Wikipedia")).click();

		System.out.println();
		d.close();

		// log in to google verify title -> Test 1
		// type "Thapa" in text box and enter -> Test 2
		// New page get URL -> Test 3
		// Click on the link and get title of that page -> Test 5

		// Driver.close();

	}

}
