import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.DragDropPage;

import utils.WebDriverFactory;

import static org.testng.Assert.assertTrue;


public class DragDropTest {
    DragDropPage dragDropPage = null;



    @BeforeMethod
    public void setUp() {
        WebDriverFactory.createInstance("Firefox");
        dragDropPage = new DragDropPage();
    }

    @Test
    public void dragDropFigure() {
        dragDropPage.navigateTo();
        dragDropPage.figureIsVisible();
        dragDropPage.firstFigureWasNamed();
        dragDropPage.dragNDrop();


//        dragDropPage.firstFigureWasNamed1();

//        assertTrue(dragDropPage.firstFigure != dragDropPage.firstFigure1);

    }

}
