package mavenproject0.mpo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDemo {
	WebDriver driver;
	
	@Parameters({"choice"})
	@BeforeSuite
	public void chromeBrowser(@Optional("chrome")String browser )throws InterruptedException {
	    if (browser.equalsIgnoreCase("chrome")) {
	    	System.out.println("chrome is: "+browser);
	    	System.out.println("browser is: "+browser);
	    	WebDriverManager.chromedriver().setup();
	    	driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().deleteAllCookies();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	    }
	    else if (browser.equalsIgnoreCase("firefox")) {
	    	System.out.println("browser is: "+browser);
	    	WebDriverManager.firefoxdriver().setup();
	    	driver = new FirefoxDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().deleteAllCookies();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	    }
	    else if (browser.equalsIgnoreCase("edge")) {
	    	System.out.println("browser is: "+browser);
	    	WebDriverManager.edgedriver().setup();
	    	driver = new EdgeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().deleteAllCookies();
	    	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
	    }
	}	
	@Test
	public void loginTest() throws InterruptedException {
		driver.get("https://www.rameshsoft.com");
	    Thread.sleep(6000);
	    driver.findElement(By.xpath("//a[text()='Videos']")).click();
	    Thread.sleep(6000);
	    Thread.sleep(9000);  
	}
	@AfterSuite
	public void closeBrowser() throws InterruptedException {
		Thread.sleep(6000);
		if (driver!=null) {
			driver.quit();
		}
		else {
			//throw exception
	}
	}
	}

