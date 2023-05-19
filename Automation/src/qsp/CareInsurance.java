package qsp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CareInsurance {
	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.careinsurance.com/rhicl/proposalcp/renew/index-care");
		driver.findElement(By.id("policynumber")).sendKeys("123");
		driver.findElement(By.id("dob")).click();
		WebElement calender = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select s = new Select(calender);
		s.selectByVisibleText("1998");
		WebElement calender1 = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		Select s1 = new Select(calender1);
		s1.selectByVisibleText("Sep");
		driver.findElement(By.xpath("//a[text()='19']")).click();
		driver.findElement(By.id("alternative_number")).sendKeys("9012390123");
		Thread.sleep(2000);
		driver.findElement(By.id("renew_policy_submit")).click();
		String text = "Please enter valid Policy No.";
		WebElement text1 = driver.findElement(By.id("policynumberError"));
		String a =text1.getText();
		if(text.equals(a))
		{
			System.out.println("Is Displayed");
		}
		else {
			System.out.println("Not displayed");
		}

	}

}
