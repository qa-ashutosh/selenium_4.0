import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

// program will capture the screenshot of a particular WebElement

public class WebElementScreenshot {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver","/Users/ashu/Tools/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        WebElement nameField = driver.findElement(By.cssSelector("[name = 'name']"));
        nameField.sendKeys("John Smith");
        File file = nameField.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("screenshots/screenshot.png"));

        driver.quit();
    }
}
