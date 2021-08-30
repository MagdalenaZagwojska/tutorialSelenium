import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class XPatchTest {

    @Test
    public void findElements(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://testeroprogramowania.github.io/selenium/basics.html");


    By buttonId = By.xpath("/html/body/button[@id='clickOnMe']");
    WebElement clickOnMeButton = driver.findElement(buttonId);
    //clickOnMeButton.click();


    By firstName = By.xpath("//input[@name='fname']");
    WebElement firstNameInput = driver.findElement(firstName);
    firstNameInput.sendKeys("Grażyna");


    WebElement paragraphHidden = driver.findElement(By.xpath("//p[@class='topSecret']"));

    By inputLocator = By.xpath("//input");
    WebElement input = driver.findElement(inputLocator);

    By linkText = By.xpath("//a[text()='Visit W3Schools.com!']");
    WebElement schoolLink = driver.findElement(linkText);

    By partialLink = By.xpath("//a[contains(text(),'Visit')]");
    WebElement partSchoolLink = driver.findElement(partialLink);


    By fullPatch = By.xpath("/html/body/div/ul");
    driver.findElement(fullPatch);

    By shortPatch = By.xpath("//ul");
    driver.findElement(shortPatch);


    By allXPatch = By.xpath("//*");
    driver.findElement(allXPatch);

    By indexXPatch = By.xpath("(//input)[2]");
    driver.findElement(indexXPatch).click();

    By lastElement = By.xpath("(//input)[last()]");
    driver.findElement(lastElement);

    By elementWithAttribute = By.xpath("//*[@name]");
    driver.findElement(elementWithAttribute);

    By elementWithAttributeName = By.xpath("//*[@name='fname']");
    driver.findElement(elementWithAttributeName);

    By attributeEquals = By.xpath("//button[@id='clickOnMe']");
    driver.findElement(attributeEquals);

    By attributeNotEquals = By.xpath("//button[@id!='clickOnMe']");
    driver.findElement(attributeNotEquals);

    By contains = By.xpath("//*[contains(@name,'ame')]");
    driver.findElement(contains);

    By startsWith = By.xpath("//*[starts-with(@name,'f')]");
    driver.findElement(startsWith);







    }
}
