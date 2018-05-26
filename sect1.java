import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sect1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rajen\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.get("http:\\www.google.com");
		// System.out.println(d.getPageSource());
		// System.out.println(d.getTitle());

		d.findElement(By.className("gsfi")).sendKeys("Thapa");
		d.findElement(By.className("gsfi")).sendKeys(Keys.ENTER);

		// d.close();

	}

}
