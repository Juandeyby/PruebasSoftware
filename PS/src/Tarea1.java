import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Tarea1 {
	
	final static String LINK_PRINCIPAL = "http://www.unsa.edu.pe";
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
		
		//Comprobando Telefono Centro Médico Universitario P. P. Díaz
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centros Médicos
		web = driver.findElement(By.xpath("//a[@id='menu587']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centro Médico Universitario P. P. Díaz
		web = driver.findElement(By.xpath("//a[@id='menu588']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		web = driver.findElement(By.linkText("Contacto"));
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
		
		
		//Comprobando Telefono Centro Universitario de Salud de Río Seco
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centros Médicos
		web = driver.findElement(By.xpath("//a[@id='menu587']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centro Universitario de Salud de Río Seco
		web = driver.findElement(By.xpath("//a[@id='menu589']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		web = driver.findElement(By.linkText("Contacto"));
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Instituto de Salud del Adolescente 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centros Médicos
		web = driver.findElement(By.xpath("//a[@id='menu587']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Instituto de Salud del Adolescente
		web = driver.findElement(By.xpath("//a[@id='menu590']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		web = driver.findElement(By.linkText("Contacto"));
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Departamento Médico 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centros Médicos
		web = driver.findElement(By.xpath("//a[@id='menu587']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Departamento Médico 
		web = driver.findElement(By.xpath("//a[@id='menu591']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		web = driver.findElement(By.linkText("Contacto"));
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando MEDIUNSA
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centros Médicos
		web = driver.findElement(By.xpath("//a[@id='menu587']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar MEDIUNSA
		web = driver.findElement(By.xpath("//a[@id='menu592']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Hospital Docente Centro Médico de Atención Primaria  I – III
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centros Médicos
		web = driver.findElement(By.xpath("//a[@id='menu587']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Hospital Docente Centro Médico de Atención Primaria  I – III
		web = driver.findElement(By.xpath("//a[@id='menu719']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Laboratorio de Análisis Clínicos 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centros Médicos
		web = driver.findElement(By.xpath("//a[@id='menu593']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Laboratorio de Análisis Clínicos 
		web = driver.findElement(By.xpath("//a[@id='menu594']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
		
		//Comprobando LABINVSERV
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centros Médicos
		web = driver.findElement(By.xpath("//a[@id='menu593']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar LABINVSERV
		web = driver.findElement(By.xpath("//a[@id='menu595']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Planta de Segregación de Minerales
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centros Médicos
		web = driver.findElement(By.xpath("//a[@id='menu593']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Planta de Segregación de Minerales
		web = driver.findElement(By.xpath("//a[@id='menu596']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Laboratorio Entomológico 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centros Médicos
		web = driver.findElement(By.xpath("//a[@id='menu593']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Laboratorio Entomológico 
		web = driver.findElement(By.xpath("//a[@id='menu597']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Laboratorio de Biotecnología 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centros Médicos
		web = driver.findElement(By.xpath("//a[@id='menu593']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Laboratorio de Biotecnología 
		web = driver.findElement(By.xpath("//a[@id='menu598']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Laboratorio Regional de Análisis de Suelos y Plantas 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centros Médicos
		web = driver.findElement(By.xpath("//a[@id='menu593']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Laboratorio Regional de Análisis de Suelos y Plantas 
		web = driver.findElement(By.xpath("//a[@id='menu599']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Laboratorio de Concreto y Ensayo de Materiales
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centros Médicos
		web = driver.findElement(By.xpath("//a[@id='menu593']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Laboratorio de Concreto y Ensayo de Materiales
		web = driver.findElement(By.xpath("//a[@id='menu600']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Centro de Microscopía Electrónica 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centros Médicos
		web = driver.findElement(By.xpath("//a[@id='menu593']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centro de Microscopía Electrónica 
		web = driver.findElement(By.xpath("//a[@id='menu601']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}

		//Comprobando Centro de Energías Renovables y Eficiencia Energética 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centros Médicos
		web = driver.findElement(By.xpath("//a[@id='menu593']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centro de Energías Renovables y Eficiencia Energética 
		web = driver.findElement(By.xpath("//a[@id='menu602']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
		
		//Comprobando Instituto de Informática
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Servicios Académicos
		web = driver.findElement(By.xpath("//a[@id='menu603']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Instituto de Informática
		web = driver.findElement(By.xpath("//a[@id='menu604']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Biblio UNSA - Infomóvil 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Servicios Académicos
		web = driver.findElement(By.xpath("//a[@id='menu603']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Biblio UNSA - Infomóvil 
		web = driver.findElement(By.xpath("//a[@id='menu605']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Biblio UNSA - Infomóvil 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Servicios Académicos
		web = driver.findElement(By.xpath("//a[@id='menu603']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Instituto Universitario del Deporte 
		web = driver.findElement(By.xpath("//a[@id='menu606']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Centro de Idiomas 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Servicios Académicos
		web = driver.findElement(By.xpath("//a[@id='menu603']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Centro de Idiomas 
		web = driver.findElement(By.xpath("//a[@id='menu607']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando LIBUNSA 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Servicios Académicos
		web = driver.findElement(By.xpath("//a[@id='menu603']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar LIBUNSA 
		web = driver.findElement(By.xpath("//a[@id='menu608']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Unidad de Capacitación Producción y Servicios
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Servicios Académicos
		web = driver.findElement(By.xpath("//a[@id='menu603']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Unidad de Capacitación Producción y Servicios
		web = driver.findElement(By.xpath("//a[@id='menu762']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Areas Deportivas 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Infraestructura
		web = driver.findElement(By.xpath("//a[@id='menu609']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Areas Deportivas 
		web = driver.findElement(By.xpath("//a[@id='menu610']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Complejo Cultural 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Infraestructura
		web = driver.findElement(By.xpath("//a[@id='menu609']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Complejo Cultural 
		web = driver.findElement(By.xpath("//a[@id='menu611']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Panificadora UNSA
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Producción de Bienes
		web = driver.findElement(By.xpath("//a[@id='menu612']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Panificadora UNSA
		web = driver.findElement(By.xpath("//a[@id='menu613']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Carpintería de Madera 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Producción de Bienes
		web = driver.findElement(By.xpath("//a[@id='menu612']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Carpintería de Madera 
		web = driver.findElement(By.xpath("//a[@id='menu614']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Servicios Industriales 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Producción de Bienes
		web = driver.findElement(By.xpath("//a[@id='menu612']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Servicios Industriales 
		web = driver.findElement(By.xpath("//a[@id='menu615']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 250)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando TV UNSA Canal 45 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
	
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Medios de Comunicación y Publicaciones
		web = driver.findElement(By.xpath("//a[@id='menu616']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar TV UNSA Canal 45 
		web = driver.findElement(By.xpath("//a[@id='menu617']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 300)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
	
		//Comprobando Radio Universidad 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Medios de Comunicación y Publicaciones
		web = driver.findElement(By.xpath("//a[@id='menu616']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Radio Universidad 
		web = driver.findElement(By.xpath("//a[@id='menu618']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 300)");
		//Click al link Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
		
		//Comprobando Artes Gráficas 
		//Ingresar pagina principal
		driver.get(LINK_PRINCIPAL);
//		driver.manage().window().maximize();
		
		//Ingresar Producción Servicios
		web = driver.findElement(By.xpath("//a[@id='menu586']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Medios de Comunicación y Publicaciones
		web = driver.findElement(By.xpath("//a[@id='menu616']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		new Actions(driver).moveToElement(web).perform();
		
		Thread.sleep(1000);
		//Ingresar Artes Gráficas 
		web = driver.findElement(By.xpath("//a[@id='menu619']"));
		System.out.print(web.getAttribute("title").toString() + " ** ");
		web.click();
		
		Thread.sleep(1000);
		//Bajar el scroll de la pagina
		jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 300)");
		//Buscar Contacto
		webs = driver.findElements(By.linkText("Contacto"));
		if (webs.size() == 0) {
			//Comprobar si hay telefono
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() > 0) {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			} else {
				System.err.println("NO tiene telefono");
				sin_telefono++;
			}
		} else {
			//Click al link Contacto
			webs.get(0).click();
			Thread.sleep(1000);
			
			//Bajar el scroll de la pagina
			jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0, 250)");
			Thread.sleep(1000);
			//Comprobando si tiene Telefono como strong
			webs = driver.findElements(By.xpath("//strong[text()='Teléfono']"));
			if (webs.size() == 0) {
				//Comprobando si tiene Telefono como span
				webs = driver.findElements(By.xpath("//span[text()='Teléfono :']"));
				if (webs.size() > 0) {
					System.err.println("SI tiene Telefono");
					con_telefono++;
				} else {
					System.err.println("NO tiene telefono");
					sin_telefono++;
				}
			} else {
				System.err.println("SI tiene Telefono");
				con_telefono++;
			}
		}
		
		Thread.sleep(1000);
		
		//Estadisticas
		System.out.println("Con telefono \t" + con_telefono);
		System.out.println("Sin telefono \t" + sin_telefono);
		System.out.println("Total comprobados \t" + (con_telefono + sin_telefono));
		//Cerrar Pestana
		driver.close();
	}
}
