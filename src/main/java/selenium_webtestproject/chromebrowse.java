package selenium_webtestproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromebrowse {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		System.getProperty("webdriver.chrome.driver","C:\\Users\\KIIT\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://www.makemytrip.com/railways/");
	    Thread.sleep(2000);
		String url = driver.getCurrentUrl();
		System.out.println("URL: "+url);
		System.out.println("Title of page: "+driver.getTitle());
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[1]/label/span")).click();
		driver.findElement(By.xpath("//input[@id='fromCity']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"From\"]")).sendKeys("DELHI");
		Thread.sleep(2000);
	    driver.findElement(By.xpath("//*/li[@data-suggestion-index=\"0\"]")).click();
		driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder=\"To\"]")).sendKeys("LKO");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*/li[@data-suggestion-index=\"0\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"travelDate\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div/div/div[2]/div/div[3]/label/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div/div/div[2]/div/div[4]/label/span")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*/li[@data-cy=\"3A\"]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*/a[@data-cy=\"submit\"]")).click();
		Thread.sleep(4000);
		driver.quit();
		

	}

}
