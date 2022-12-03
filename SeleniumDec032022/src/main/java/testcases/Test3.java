package testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3 {

	
	@Test
	public void test1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goodreads.com/genres/self-help");
		driver.findElement(By.xpath("//a[contains(text(),'My Books')]")).click();
		System.out.println(driver.findElement(By.cssSelector("div.column_right>h1")).getText());
		System.out.println(driver.findElement(By.cssSelector("div.column_right>h1+p")).getText());
		System.out.println("Test case passed");
		driver.quit();
		
	}
}
