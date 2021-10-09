import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;




public class CheckFirefox {
public static void main(String args[]) {
	System.setProperty("webdriver.gecko.driver","D:\\Firefox\\geckodriver.exe");
	WebDriver drivera=new FirefoxDriver();
	drivera.get("https://www.facebook.com");
	System.out.println("the URL of the website is "+drivera.getCurrentUrl());
	

}
}
