import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementHeightWidth {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/ashu/Tools/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        WebElement nameField = driver.findElement(By.cssSelector("[name = 'name']"));
        int height = nameField.getRect().getDimension().getHeight();
        int width = nameField.getRect().getDimension().getWidth();
        System.out.println(height);
        System.out.println(width);

        driver.quit();
    }
}
