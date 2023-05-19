package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HtandWtOfTextBox {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");

	}
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement find = driver.findElement(By.name("username"));
		WebElement find1 = driver.findElement(By.name("pwd"));
        int h1 = find.getSize().getHeight();
		int w1 = find1.getSize().getWidth();
		int h2 = find.getSize().getHeight();
		int w2 = find1.getSize().getWidth();
		if(h1==h2 && w1==w2)
		{
			System.out.println("UN and PWD textbox is present in actitime");
		}
		else
		{
			System.out.println("UN and PWD textbox is not present in actitime");
		}

}
}