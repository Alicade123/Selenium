package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CheckboxesPage {
    private WebDriver driver;
    private By checkboxForm= By.id("checkboxes");
    private By checkboxForm1box= By.cssSelector("#checkboxes input");
    public CheckboxesPage(WebDriver driver){
        this.driver = driver;
    }
    public boolean checkboxMethod(){
        driver.findElement(checkboxForm1box).click();
        return driver.findElement(checkboxForm1box).isSelected();
    }
    public void playWithCheckbox(){
        List <WebElement> checkboxes = driver.findElements(checkboxForm1box);
        for(WebElement   checkbox : checkboxes ){
            checkbox.click();
        }

    }

}
