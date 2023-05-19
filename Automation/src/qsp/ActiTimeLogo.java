package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLogo {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		boolean logo=driver.findElement(By.id("keepLoggedInLabel")).isSelected();
		if(logo==true)
		{
			System.out.println("Checkbox is present");
		}
		else
		{
			System.out.println("not present");
		}

}
}
