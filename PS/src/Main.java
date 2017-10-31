import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Main {
	
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
		driver.get("http://www.unsa.edu.pe");
//		driver.manage().window().maximize();
		
		WebElement web;
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.println(web.getAttribute("title").toString());
		web.click();
		
		Thread.sleep(1000);
		web = driver.findElement(By.xpath("//a[@id='menu587']"));
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		web = driver.findElement(By.xpath("//a[@id='menu588']"));
		new Actions(driver).moveToElement(web).perform();
		web.click();
		
		Thread.sleep(1000);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		web = driver.findElement(By.linkText("Contacto"));
		web.click();
		
		Thread.sleep(1000);
		List <WebElement> webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
		System.out.println(webs.size() > 0 ? "SI tiene Telefono" : "NO tiene telefono");
		driver.close();
		
//		WebElement web;
//		web = driver.findElement(By.className("menu-title"));
//		web = driver.findElement(By.tagName("span"));
//		web = driver.findElement(By.linkText("Producción Servicios"));
//		Actions action = new Actions(driver);
//		action.moveToElement(web).perform();
		
//		Actions action = null;
//		
//		Consumer<By> hover = (By by) -> {
//	        action.moveToElement(driver.findElement(by))
//	              .perform();
//	    };
		
//	    hover.accept(By.linkText("menu586"));
	    
		//Produccion y Servicios
//		web = driver.findElement(By.id("menu586"));
//		new Actions(driver).moveToElement(web).perform();
//		
//		web = driver.findElement(By.id("menu587"));
//		new Actions(driver).moveToElement(web).build().perform();
		
//		web.sendKeys("20130898");
//		web = driver.findElement(By.name("dni"));
//		web.sendKeys("76551100");
//		web = driver.findElement(By.name("escuela"));
//	    List<WebElement> optiones = web.findElements(By.tagName("option"));
//	    for(WebElement option : optiones){
//	        if(option.getText().equals(" INGENIERIA DE SISTEMAS ")) {
//	            option.click();
//	            break;
//	        }
//	    }
//		web = driver.findElement(By.className("boton"));
//		web.click();
//		new WebDriverWait(driver, 10).until(
//				new ExpectedCondition<Boolean>() {
//					public Boolean apply (WebDriver d) {
//						WebElement elem = driver.findElement(By.name("pass"));
//						elem.submit();
//						return true;
//					}
//				}
//				);
//		driver.close();
	} 

}
