package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;
import static org.openqa.selenium.support.ui.ExpectedConditions.presenceOfElementLocated;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverFactory;
import static org.testng.Assert.assertTrue;

public class DragDropPage {
//    private WebDriver driver = null;
    public String firstFigure;
    public String firstFigure1;


    public void navigateTo(){
        WebDriverFactory.getDriver().get("http://the-internet.herokuapp.com/drag_and_drop");
    }
    public void figureIsVisible(){
        WebDriverWait wait = new WebDriverWait(WebDriverFactory.getDriver(), 10);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='column-a']"))).isDisplayed();
    }
    public void firstFigureWasNamed(){
       firstFigure =  WebDriverFactory.getDriver().findElement(By.xpath("//*[@id='columns']//*[1]//*[1]")).getText();
        System.out.println("First figure on start is " + firstFigure);
    }
    public void dragNDrop(){
        //Actions class method to drag and drop
        Actions builder = new Actions(WebDriverFactory.getDriver());
        WebElement from = WebDriverFactory.getDriver().findElement(By.id("column-a"));
        WebElement to = WebDriverFactory.getDriver().findElement(By.id("column-b"));
        //Perform drag and drop
        builder.dragAndDrop(from, to).perform();


    }


//    public void firstFigureWasNamed1(){
//        firstFigure1 = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id='column-a']")).getText();
//    }

}
