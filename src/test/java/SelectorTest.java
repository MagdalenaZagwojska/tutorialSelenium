import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class SelectorTest {

    @Test
    public void findElements(){
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://testeroprogramowania.github.io/selenium/basics.html");


    /*By buttonId = By.id("clickOnMe");
    WebElement clickOnMeButton = driver.findElement(buttonId);
    //clickOnMeButton.click();

    By firstName = By.name("fname");
    WebElement firstNameInput = driver.findElement(firstName);
    //firstNameInput.sendKeys("Marysia");

    WebElement paraHidden = driver.findElement(By.className("topSecret"));

    By inputLocator = By.tagName("input");
    WebElement input = driver.findElement(inputLocator);
    input.sendKeys("Barnaba");
    List<WebElement> inputs = driver.findElements(inputLocator);
        System.out.println(inputs.size());*/

       /* By linkTekst = By.linkText("Visit W3Schools.com");
        WebElement schoolLink = driver.findElement(linkTekst);
        schoolLink.click();*/

        By partOfLinkTekst = By.partialLinkText("IamWeird");
        WebElement weirdLink = driver.findElement(partOfLinkTekst);
        weirdLink.click();


    }
}
