import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class Rdio_CheckBox_Example {
    WebDriver driver;

    @BeforeMethod
    public void radio_checkbox_BeforeTests() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void radioTests(){
        //<<<<<<<<Radio>>>>>>>>>>>
        driver.get("https://www.leafground.com/radio.xhtml");
        //1) Find the default select radio button

        boolean chromeradioOption=driver.findElement(By.id("j_idt87:console1:0")).isSelected();
        boolean firefoxradioOption=driver.findElement(By.id("j_idt87:console1:1")).isSelected();
        boolean safariradioOption=driver.findElement(By.id("j_idt87:console1:2")).isSelected();
        boolean edgeradioOption=driver.findElement(By.id("j_idt87:console1:3")).isSelected();

        if(chromeradioOption){
            String chromeText=driver.findElement(By.xpath("//label[@for='j_idt87:console1:0']")).getText();
            System.out.println("default select radio button is: "+chromeText);
        } else if (firefoxradioOption) {
            String firefoxText=driver.findElement(By.xpath("//label[@for='j_idt87:console1:1']")).getText();
            System.out.println("default select radio button is: "+firefoxText);
        } else if (safariradioOption) {
            String safariText=driver.findElement(By.xpath("//label[@for='j_idt87:console1:2']")).getText();
            System.out.println("default select radio button is: "+safariText);
        } else if (edgeradioOption) {
            String edgeText=driver.findElement(By.xpath("//label[@for='j_idt87:console1:3']")).getText();
            System.out.println("default select radio button is: "+edgeText);
        }
        //second method to 1)
//        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@name='color']"));
//        List<WebElement> radioLabels = driver.findElements(By.xpath("//input[@name='color']/following-sibling::label"));
//
//        int index = 0;
//        int defaultSelectedRadioButtonIndex = -1;
//
//        for (WebElement radioElement: radioButtons) {
//            if (radioElement.isSelected()) {
//                defaultSelectedRadioButtonIndex = index;
//                System.out.println("Default Selected Radio Button Text: " + radioLabels.get(defaultSelectedRadioButtonIndex).getText());
//            }
//            index++;
//        }


        //2) Select the age group (only if not selected)
        WebElement myAge=driver.findElement(By.id("j_idt87:age:0"));
        boolean isChecked = myAge.isSelected();
        if (!isChecked){
            driver.findElement(By.xpath("//label[@for='j_idt87:age:0']")).click();
        }

        //second method to the 2)
        // String ageValue = "0-20 Years";
        // List<WebElement> elements = driver.findElements(By.tagName("label"));
        // for (WebElement element: elements) {
        //     String ageGroupText = element.getText();
        //     if (ageGroupText.equals(ageValue)) {
        //         WebElement ageGroupInput = element.findElement(By.xpath(".//input[@type='radio']"));
        //         if (!ageGroupInput.isSelected()) {
        //             element.click();
        //}
        //         break;
        //}
        //}

    }

    @Test
    public void CheckBoxTest(){
        //<<<<<<<<<CheckBox>>>>>>>>>>>>
        driver.get("https://www.leafground.com/checkbox.xhtml");
        //1) Select wanted checkboxes and Verifying those checkboxes selected Status
        List<WebElement> checkBoxList =  driver.findElements(By.xpath("//table[@id='j_idt87:basic']//label"));
        for (WebElement element:checkBoxList){
            if (!(element.getText().equals("Othe" +
                    "rs"))){
                element.click();
            }

            for (int i=1; i<checkBoxList.size(); i++){
                boolean checkBoxStatus=driver.findElement(By.xpath("//table[@id='j_idt87:basic']//label[@for='j_idt87:basic:"+i+"']")).isSelected(); ////table[@id='j_idt87:basic']//input["+i+"]
                System.out.println("CheckBox "+i+ "selected status is: "+checkBoxStatus);
            }
        }
    }
}
