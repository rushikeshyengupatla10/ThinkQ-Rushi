package Salenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import com.seleniumwebdriver.Webdriver;

public class FacebookNewAccountCreation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Akash\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
		dr.manage().window().maximize();
		
		dr.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		dr.navigate().to("https://www.facebook.com/");
		dr.findElement(By.xpath("//a[text()='Create New Account']")).click();
        dr.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Hari");
        dr.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Joshi");
        dr.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("hari@gmail.com");
        dr.findElement(By.xpath("//input[@aria-label='Re-enter email address']")).sendKeys("hari@gmail.com");
        dr.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Hari@3456");
        
        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        Select sl = new Select(dr.findElement(By.id("day")));
        sl.selectByIndex(26);
        Select sl1 = new Select(dr.findElement(By.id("month")));
        sl1.selectByValue("06");
        Select sl2 = new Select(dr.findElement(By.id("year")));
        sl2.selectByVisibleText("1996");
        
        dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        dr.findElement(By.xpath("//label[text()='Male']")).click();
        dr.findElement(By.xpath("//button[@name='websubmit']")).click();
	}

}