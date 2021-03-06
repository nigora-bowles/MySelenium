package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalPageLinks {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.amazon.com");	
		//list is interface which is a parent of arraylist
		List<WebElement> linkList = driver.findElements(By.tagName("a"));
		
		System.out.println("total number of links "+linkList.size());
		
		for(int i=0;i<linkList.size(); i++) {
		
			String text = linkList.get(i).getText();
			
			System.out.println(text);
			}
		}
		
	}


