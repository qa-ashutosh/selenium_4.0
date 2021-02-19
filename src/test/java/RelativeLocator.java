import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.support.locators.RelativeLocator.withTagName;


public class RelativeLocator {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/ashu/Tools/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");

        WebElement nameField = driver.findElement(By.cssSelector("[name = 'name']"));
        String labelTextAbove = driver.findElement(withTagName("label").above(nameField)).getText();
        System.out.println(labelTextAbove);

        String labelTextBelow = driver.findElement(withTagName("label").below(nameField)).getText();
        System.out.println(labelTextBelow);

        WebElement radioButton = driver.findElement(By.id("inlineRadio1"));
        String labelTextRight = driver.findElement(withTagName("label").toRightOf(radioButton)).getText();
        System.out.println(labelTextRight);

        WebElement iceCreamLabel = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
        WebElement iceCreamCheckbox = driver.findElement(withTagName("input").toLeftOf(iceCreamLabel));
        iceCreamCheckbox.click();
        System.out.println(iceCreamCheckbox.isSelected());

        driver.quit();
    }
}
