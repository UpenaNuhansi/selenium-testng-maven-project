import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ButtonExample {

    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage(){
        driver = new ChromeDriver();
        Dimension newSize = new Dimension(800, 600);
        driver.manage().window().setSize(newSize);
//        driver.manage().window().maximize();
        driver.get("https://www.leafground.com/button.xhtml");
    }

    @Test
    public void TestButtons(){
        //01) Click and confirm title
        driver.findElement(By.xpath("//button[@id='j_idt88:j_idt90']")).click();
        String expectedTitle = "Dashboard";
        String actualTitle = driver.getTitle();
//        if (expectedTitle.equals(actualTitle)){
//            System.out.println("Actual Title same as Expected Title");
//        }else {
//            System.out.println("Actual Title is not same as Expected Title");
//        }

        Assert.assertEquals(actualTitle, expectedTitle,"Title miss matched");

        //02) Find the position of the submit button
        driver.navigate().back();
        WebElement getPosition = driver.findElement(By.id("j_idt88:j_idt94"));
        Point xy = getPosition.getLocation();
        int x= xy.getX();
        int y = xy.getY();
        System.out.println("The x position : " + x + "\nThe y position: "+ y);

        //03) Find the save button color
        WebElement savebutton = driver.findElement(By.id("j_idt88:j_idt96"));
        String color = savebutton.getCssValue("background-color");
        System.out.println("The button's color: " + color);

        //04) Find the height and width of this button
        WebElement HeighandWidthOfbtn = driver.findElement(By.id("j_idt88:j_idt98"));
        int height = HeighandWidthOfbtn.getSize().getHeight();
        int width = HeighandWidthOfbtn.getSize().getWidth();
        System.out.println("The height of the button is: " + height + "\nThe width of the button is: " + width);
    }

}
