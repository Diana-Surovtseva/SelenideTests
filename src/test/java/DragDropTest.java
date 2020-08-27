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
        dragDropPage.startPositionIs();
        dragDropPage.dragNDrop();
        dragDropPage.finalPositionIs();
        assertTrue(dragDropPage.element1 != dragDropPage.element2);
    }

}