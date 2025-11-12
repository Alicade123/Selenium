package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class DropDownPage {
    WebDriver driver;
    private By dropDown = By.id("dropdown");

    public DropDownPage(WebDriver driver){
    this.driver=driver;
    }
//    public void selectFromDropDown(String option){
//        Select dropDownElement = new Select(driver.findElement(dropDown));
//        dropDownElement.selectByVisibleText(option);
//    }
        public void selectFromDropDown(String option){
       findDropDown().selectByVisibleText(option);
    }

    public List<String> getSelectedOptions(){
        List<WebElement> selectedElements = findDropDown().getAllSelectedOptions();
        return selectedElements.stream().map(e->e.getText()).collect(Collectors.toList());
    }
    private Select findDropDown(){
        return new Select(driver.findElement(dropDown));
    }
    /*

     */


}
