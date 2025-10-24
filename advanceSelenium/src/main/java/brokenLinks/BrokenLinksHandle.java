package brokenLinks;

import java.net.HttpURLConnection;
import java.net.URL;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinksHandle {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));

		WebElement search = driver
				.findElement(By.xpath("//input[@title='Search for Products, Brands and More' and @name='q']"));
		search.sendKeys("Iphone 15 pro", Keys.ENTER);
		Thread.sleep(2000);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.print("All links: " + links.size());

		for (WebElement link : links) {
			String url = link.getAttribute("href");

			if (url == null || url.isEmpty()) {
				System.out.println("Null or Empty URL been Skipped");
				continue;
			}
			verifyLink(url);

		}
		driver.quit();

	}

	private static void verifyLink(String url) {

		try {
			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			connection.setRequestMethod("Head");
			connection.connect();
			int responseCode = connection.getResponseCode();

			if (responseCode >= 400) {
				System.out.println(url + "--> Broken Link Code: (" + responseCode + ")");
			} else {
				System.out.println(url + "--> valid Link Code: (" + responseCode + ")");
			}
		} catch (Exception e) {
			System.out.println(url + "--> Error Code:" + e.getMessage());
		}

	}

}
