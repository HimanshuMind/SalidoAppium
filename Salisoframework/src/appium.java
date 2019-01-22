import org.testng.annotations.Test;


import java.awt.Point;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class appium {

	
@Test
public void salidoPOS () throws InterruptedException, MalformedURLException
{
	//IOSDriver<MobileElement> Driver1 = null;
			DesiredCapabilities cap = new DesiredCapabilities();

			
			cap.setCapability("platformName","iOS");
			cap.setCapability("platformversion","10.1");
			//cap.setCapability("deviceName","iphone Simulator");
			//cap.setCapability("deviceName","iphone 6");////////
			cap.setCapability("deviceName","iPad Pro (9.7-inch)");////////
			cap.setCapability("noReset","true");
			//cap.setCapability("noReset","true");////////////////
			//cap.setCapability("app","Users/itisg/Downloads/UICatalog.app");
			cap.setCapability("app","/Users/itisg/Desktop/PointOfSale.app");
			
			cap.setCapability("automationName","Xcuitest");
			//cap.setCapability("udid","D9882E1zx3-9415-4AC5-80E7-C6C31542348C");
			//cap.setCapability("udid","EA4BEB01-6CB9-491D-82A0-3A472B38416C");iphone 
			cap.setCapability("udid", "C30889B1-9EE3-4F61-9B85-811796E99AE1");//mac 
			
			
			
			
			//cap.setCapability(CapabilityType.BROWSER_NAME,"safari");
			
			//Driver1.get("Https://www.google.com");
			
			AppiumDriver<MobileElement> appium = new IOSDriver<MobileElement>(new URL ("http://0.0.0.0:4723/wd/hub"),cap);
			//appium.findElement(By.name("Swipe Left to Begin Setup")).click();
			 WebElement banner = appium.findElement(By.name("Swipe Left to Begin Setup"));
			    org.openqa.selenium.Point bannerPoint = banner.getLocation();
			    // Get size of device screen
			    Dimension screenSize = appium.manage().window().getSize();
			    // Get start and end coordinates for horizontal swipe
			    int startX = Math.toIntExact(Math.round(screenSize.getWidth() * 0.8));
			    int endX = 0;

			    TouchAction action = new TouchAction(appium);
			    action
			            .press(PointOption.point(startX, bannerPoint.getY()))
			            .waitAction(WaitOptions.waitOptions(Duration.ofMillis(500)))
			            .moveTo(PointOption.point(endX, bannerPoint.getY()))
			            .release();
			    appium.performTouchAction(action);
		

			System.out.println(screenSize);
			
			appium.findElement(By.name("What's your e-mail address?")).sendKeys("Himanshu.agrawal@mind-infotech.com");
			appium.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"POS - Staging\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeScrollView/XCUIElementTypeOther/XCUIElementTypeSecureTextField")).sendKeys("Mind@123");		
			
		appium.findElement(By.name("OrderEntryModalCheckmarkButton")).click();
		
			Thread.sleep(2000);	
			
			
			//Thread.sleep(2000);	
			appium.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"BigFood\"]")).click();
			appium.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"APPIUM TERMINAL\"]")).click();
			
			Thread.sleep(2000);
			appium.findElement(By.name("6")).click();
			Thread.sleep(2000);
		
			appium.findElement(By.xpath("//XCUIElementTypeButton[@name=\"6\"]")).click();
			appium.findElement(By.xpath("//XCUIElementTypeButton[@name=\"6\"]")).click();
			appium.findElement(By.xpath("//XCUIElementTypeButton[@name=\"6\"]")).click();
			appium.findElement(By.xpath("//XCUIElementTypeButton[@name=\"6\"]")).click();
			appium.findElement(By.xpath("//XCUIElementTypeButton[@name=\"6\"]")).click();
			Thread.sleep(2000);
			
			appium.findElement(By.name("DashboardButtonNormal")).click();
			
			appium.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Checks\"]")).click();
			
			appium.findElement(By.xpath("//XCUIElementTypeButton[@name=\"addCheckFAB\"]")).click();
			
			
			//String s= appium.findElement(By.xpath("//XCUIElementTypeApplication[@name=\"POS - Staging\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeTextField[2]")).getText();
			//XCUIElementTypeApplication[@name="POS - Staging"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[3]/XCUIElementTypeOther/XCUIElementTypeCollectionView/XCUIElementTypeCell[1]/XCUIElementTypeTextField[2]
			//System.out.println(s);
			
			appium.findElement(By.name("Chapati Wheat Chapati")).click();
			appium.findElement(By.name("DONE")).click();
		
			appium.findElement(By.xpath("/XCUIElementTypeApplication[@name=\"POS - Staging\"]/XCUIElementTypeWindow[1]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeOther/XCUIElementTypeOther/XCUIElementTypeOther[2]/XCUIElementTypeButton")).click();
			appium.findElement(By.name("PAY")).click();
			appium.findElement(By.xpath("//XCUIElementTypeButton[@name=\"CLOSE\"]")).click();
	
			System.out.println("Salido App Launched successfully");
			
			
			
		

			Thread.sleep(2000);		
		}

	private static void elt() {
		// TODO Auto-generated method stub
		
	}
		

	}

		

		

	




