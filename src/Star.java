

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Star {
	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.thestar.com");	



	
	driver.findElement(By.xpath("//span[@class='c-button__label']")).click();
	driver.findElement(By.xpath("//span[@class='c-mediacard-labels__label c-mediacard-labels__label--section']")).click();
	driver.findElement(By.xpath("//a[@class='c-footer_anchor']")).click();
	}
}