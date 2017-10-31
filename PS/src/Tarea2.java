import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Tarea2 {
	
	final static String LINK_PRINCIPAL = "file:///C:/Users/asus/OneDrive/PS/Selenium/UNSA/www.unsa.edu.pe/index.html";
	static int con_telefono = 0;
	static int sin_telefono = 0;
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.opera.driver", "C:\\Users\\asus\\OneDrive\\PS\\operadriver_win64\\operadriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.setBinary("C:\\Program Files\\Opera\\launcher.exe");
		
		@SuppressWarnings("deprecation")
		DesiredCapabilities cap = DesiredCapabilities.opera();
		cap.setCapability(ChromeOptions.CAPABILITY, options);
//		cap.setCapability("marionette", false);
		
		@SuppressWarnings("deprecation")
		WebDriver driver = new OperaDriver(cap);
		WebElement web;
		JavascriptExecutor jse;
		List <WebElement> webs;
		
		driver.manage().deleteAllCookies();
		driver.get(LINK_PRINCIPAL);
		
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 500)");
		
		web = driver.findElement(By.xpath("//li[@class='item-693']"));
		webs = driver.findElements(By.tagName("script"));
		System.out.println(webs.get(1).getText());
		web.click();
		
	}
}
