import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class webclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rajen\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.get("https:\\google.com");
		System.out.println(d.getCurrentUrl());
		System.out.println(d.getTitle());

		// System.out.println(d.getPageSource());
		d.get("https:\\yahoo.com");
		// d.navigate().back();
		// d.navigate().forward();
		d.quit();

	}

}
