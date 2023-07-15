package DriverFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserClass {
	
	public static WebDriver driver;
	
	public static void setBrowser(String browserName) {
	
		if(browserName.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--incognito");
			options.addArguments("disable-infobars");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "chrome");
			capabilities.setCapability(ChromeOptions.CAPABILITY,options);
			capabilities.setCapability(ChromeOptions.CAPABILITY,options);
			options.merge(capabilities);
			driver = new ChromeDriver(options);
		}
		else if(browserName.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			FirefoxOptions options = new FirefoxOptions();
			options.addArguments("--incognito");
			options.addArguments("disable-infobars");
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capabilities.setCapability(CapabilityType.BROWSER_NAME, "firefox");
			capabilities.setCapability(FirefoxOptions.FIREFOX_OPTIONS,options);
			options.merge(capabilities);
			driver=new FirefoxDriver(options);
		}
		else if(browserName.equals("ie")) {
			WebDriverManager.iedriver().setup();
			InternetExplorerOptions options = new InternetExplorerOptions();
			options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
			options.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
			options.setCapability(InternetExplorerDriver.NATIVE_EVENTS,false);
			driver= new InternetExplorerDriver(options);
		}
		
	}
	
	public static WebDriver getBrowser() {
		return driver;
	}

}
