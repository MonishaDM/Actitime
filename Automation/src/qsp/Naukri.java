package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {
	static {
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.id("login_Layer")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("dmoni0709@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rithuvibi@75");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//div[@class='nI-gNb-bar2']")).click();
		//driver.findElement(By.xpath("//a[text()='View & Update Profile']")).click();
	/*	File f=new File("./data/MONI Resume.docx");
		String abpath= f.getAbsolutePath();
		Thread.sleep(5000);
		driver.findElement(By.id("attachCV")).sendKeys(abpath);
		//driver.findElement(By.linkText("CANCEL")).click();*/

	}

}
