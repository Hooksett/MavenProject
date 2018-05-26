import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class label1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rajen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.google.com/");
		d.getTitle();
		System.out.println("I like Java Class=" + d.getTitle());
		d.findElement(By.className("gsfc")).sendKeys("Thapa");
		d.findElement(By.className("gsfc")).sendKeys(Keys.ENTER);
		// System.out.println(d.page);

	}

}
