import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.tripodeal.com/flight-deal?utm_source=bing_tbk&utm_medium=cpc&utm_campaign=bing_tbk&msclkid=4b11609ff1b413d0fbf201d89055abc8");
		driver.findElement(By.xpath("//input[@id='origin']")).sendKeys("DEL");
		
		

	}

}
