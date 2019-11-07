package alex.training.toSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeDriverProperties {
	
	private static String baseURL = "https://amazon.com.mx";
	private static WebDriver driver;
	
	public void driverOpen() {
		System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir") + "\\src\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseURL);

	}
	public void driverClose() {
		driver.close();
	}
}
