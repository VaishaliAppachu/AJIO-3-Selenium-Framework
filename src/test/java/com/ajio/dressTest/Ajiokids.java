package com.ajio.dressTest;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajiokids {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt= new ChromeOptions();
	    opt.addArguments("--disable-notifications");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(opt);
		driver.get("https://www.ajio.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement ele = driver.findElement(By.xpath("//a[.='WOMEN']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).perform();
		driver.findElement(By.xpath("//a[.='Heeled Sandals']")).click();
		WebElement  ele1 = driver.findElement(By.xpath("//div[.='Strappy Chunky Heels']"));
        System.out.println(ele1.getText());
        ele1.click();
		
		
		/*Set<String> windows = driver.getWindowHandles();
		for(String win:windows)
		{
			driver.switchTo().window(win);
		}
	    driver.findElement(By.xpath("//div[@class='oval size-variant-item size-instock selected']")).click();
	}*/
}
}