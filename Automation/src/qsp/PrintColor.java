package qsp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PrintColor {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement all = driver.findElement(By.linkText("Forgotten password?"));
		String fs = all.getCssValue("font-size");
		String cl = all.getCssValue("color");
		String fw = all.getCssValue("font-weight");
		System.out.println(fs);
		System.out.println(cl);
		System.out.println(fw);
		driver.close();
	}

}
