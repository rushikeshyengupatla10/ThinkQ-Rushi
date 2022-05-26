package Practice;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip_DataSelect {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Akash\\Downloads\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver dr = new FirefoxDriver();
        dr.manage().window().maximize();
        dr.navigate().to("https://www.makemytrip.com/");
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		try 
		{
			dr.findElement(By.xpath("//span[@class='langCardClose']")).click();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		dr.findElement(By.id("fromCity")).click();
		Thread.sleep(3000);
		dr.findElement(By.xpath("//input[@class='react-autosuggest__input react-autosuggest__input--open']")).sendKeys("Delhi");
		dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//p[contains(text(),'New Delhi')]")).click();
		Thread.sleep(2000);
		
		dr.findElement(By.xpath("//p[contains(text(),'Mumbai, India')]")).click();
		//dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		while(true)
		{
			try
			{
				dr.findElement(By.xpath("//div[div[text()='October 2022']]/following-sibling::div[@class='DayPicker-Body']/div/div/div/p[text()='21']")).click();
			    break;
			}
			catch(Exception e)
			{
				dr.findElement(By.xpath("//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")).click();
			}
	     }
	}

}