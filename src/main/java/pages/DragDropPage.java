package pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import utils.WebDriverFactory;


public class DragDropPage {

    public WebElement element1;
    public WebElement element2;


    public void navigateTo() {
        WebDriverFactory.getDriver().get("http://demo.guru99.com/test/drag_drop.html");
    }

    public void startPositionIs() {
        element1 = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id='bank']//*[@class='placeholder']"));
    }

    public void dragNDrop() {
        //Actions class method to drag and drop
        Actions builder = new Actions(WebDriverFactory.getDriver());
        WebElement from = WebDriverFactory.getDriver().findElement(By.id("credit2"));
        WebElement to = WebDriverFactory.getDriver().findElement(By.id("bank"));
        //Perform drag and drop
        builder.dragAndDrop(from, to).perform();
    }

    public void finalPositionIs() {
        element2 = WebDriverFactory.getDriver().findElement(By.xpath("//*[@id='bank']//*[contains(text(),'BANK')]"));
    }

}