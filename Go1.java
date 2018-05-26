import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Go1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("WebDriver.Driver.ChromeDriver",
				"C:\\Users\\rajen\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver D = new ChromeDriver();
		D.getCurrentUrl();
		D.get("https:\\www.google.com/");
		System.out.println(D.getTitle() + "Title of Page");

	}

}
