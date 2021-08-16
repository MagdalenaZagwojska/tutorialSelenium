import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CssSelectorsTest {

    @Test
    public void findElementsUsingCss(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://testeroprogramowania.github.io/selenium/basics.html");

        By cssId = By.cssSelector("#clickOnMe");
        WebElement button = driver.findElement(cssId);
        // button.click();

        By cssClass = By.cssSelector(".topSecret");
        WebElement paragraph = driver.findElement(cssClass);

        By firstChildULDiv = By.cssSelector(" div > ul");
        By firstChildInTbody = By.cssSelector("tbody > tr");

        driver.findElement(firstChildULDiv);
        driver.findElement(firstChildInTbody);

        By firstElementAfterElement = By.cssSelector(" label + form");
        By allElementsAfterElement = By.cssSelector("label ~ form");

        driver.findElement(firstElementAfterElement);
        driver.findElement(allElementsAfterElement);

        By attributeTag = By.cssSelector("input[name='fname']");
        By attributeContains = By.cssSelector("input[name*='nam']");
        By attributeStarts = By.cssSelector("input[name^='fna']");
        By attributeEnds = By.cssSelector("input[name$='ame']");
        driver.findElement(attributeTag);
        driver.findElement(attributeContains);
        driver.findElement(attributeStarts);
        driver.findElement(attributeEnds);

        By firsChild = By.cssSelector("li:first-child");
        By lastChild = By.cssSelector("li:last-child");
        By thirdChild = By.cssSelector("li:nth-child(3)");
        driver.findElement(firsChild);
        driver.findElement(lastChild);
        driver.findElement(thirdChild);



    }
}
