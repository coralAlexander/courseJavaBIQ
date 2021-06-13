package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ac424x\\Desktop\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        WebElement byXpath = driver.findElement(By.xpath("//input[@aria-label= 'חיפוש']"));

        WebElement byCssSelector = driver.findElement(By.cssSelector("//input[@aria-label= 'חיפוש']"));

        WebElement byClassName = driver.findElement(By.className("//input[@aria-label= 'חיפוש']"));

        WebElement byId = driver.findElement(By.id("//input[@aria-label= 'חיפוש']"));

        WebElement byLinkText = driver.findElement(By.linkText("//input[@aria-label= 'חיפוש']"));

        WebElement byPartialLinkText = driver.findElement(By.partialLinkText("//input[@aria-label= 'חיפוש']"));

        WebElement byName = driver.findElement(By.name("//input[@aria-label= 'חיפוש']"));

        WebElement byTagName = driver.findElement(By.tagName("//input[@aria-label= 'חיפוש']"));

        byXpath.click();
    }
}
