import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class coke1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rajen\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		System.out.println("page source");
		System.out.println("https:\\www.google.com");
		d.get("https:\\www.google.com");
		d.getCurrentUrl();

	}

}
