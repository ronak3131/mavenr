import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Check {

	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver", "D:\\selenium\\chrome\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

driver.get("https://www.google.com");
String title =  driver.getTitle();
System.out.println("The title of the Website is "+title);
if(title.equals("Google")) {
	System.out.println("pass");
}
else {
	
	System.out.println("fail");
}
System.out.println("url is" +driver.getCurrentUrl());
driver.findElement(By.name("q")).sendKeys("selenium");
//System.out.println("page source "+driver.getPageSource());
//driver.close();
	}

}
