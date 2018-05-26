import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class level1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// System.setProperty("webdriver.chrome.driver",
		// "C:\\Users\\rajen\\Downloads\\chromedriver_win32\\chromedriver.exe");

		// WebDriver d=new ChromeDriver();
		// d.get("https:\\www.google.come");
		/// System.out.println(d.getTitle());

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rajen\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.msn.com");
		System.out.println(driver.getTitle());
		driver.close();

	}

}
