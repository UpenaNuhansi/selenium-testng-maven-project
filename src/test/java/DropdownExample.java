import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class DropdownExample {

    WebDriver driver;

    @BeforeMethod
    public void openLinkTestPage(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void leafgroundpageDropdownTest() throws InterruptedException {
        driver.get("https://www.leafground.com/select.xhtml");

        //1.1) ways of select values in Basic dropdown
        WebElement dropdown = driver.findElement(By.xpath("//select[@class='ui-selectonemenu']"));
        Select select = new Select(dropdown);
        select.selectByIndex(2);
        Thread.sleep(3000);
        select.selectByVisibleText("Playwright");
        Thread.sleep(3000);


        //1.2) get the number of dropdown options
        //generics
        List<WebElement> listOfOptions = select.getOptions();
        int size = listOfOptions.size();
        System.out.println("Number of elements in dropdown: " + size);

        for(WebElement element:listOfOptions ){
            System.out.println(element.getText());
        }

        //1.3) using sendKeys select dropdown value
        dropdown.sendKeys("Puppeteer");

        //1.4) selecting value in a Bootstrap dropdown
        WebElement dropdown2 = driver.findElement(By.xpath("//div[@id='j_idt87:country']"));
        dropdown2.click();
        List<WebElement> listofdropdown2values = driver.findElements(By.xpath("//ui[@id='j_idt87:country_items']/li"));
        for (WebElement element:listofdropdown2values){
            String dropDownvalue = element.getText();
            if (dropDownvalue.equals("USA")){
                element.click();
                break;
            }
        }
    }

    //2) Google Search - pick a value from suggestions
    @Test
    public void googleSearchDropDown() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("qa internship");
        Thread.sleep(2000);
        List<WebElement> googlesearchlist = driver.findElements(By.xpath("//ul[@role = 'listbox']/li//div[@class='lnnVSe']"));
        System.out.println(googlesearchlist.size());
        for (WebElement element : googlesearchlist) {
            System.out.println(element.getText());
            if (googlesearchlist.equals("qa internship")) {
                element.click();
                break;
            }
        }
    }

    //3) Handle Hidden Auto Suggestions Drop Down And Search using DOM Debugger Trick
    // turn on debug mode using SelecterHub
    @Test
    public void flipcartHiddenDropDown() throws InterruptedException {
        driver.get("https://www.flipkart.com/");
        driver.findElement(By.name("q")).sendKeys("mackbook");
        Thread.sleep(2000);
        List<WebElement> flipkartsearchlist = driver.findElements(By.xpath("//ul[@class='col-12-12 bbjHWC QDWHTu']/li//div[@class='OEFxE6']"));
        System.out.println(flipkartsearchlist.size());
        for (WebElement element2 : flipkartsearchlist) {
            System.out.println(element2.getText());
            if (flipkartsearchlist.equals("mackbook air m2")) {
                element2.click();
                break;
            }
        }
    }

}

