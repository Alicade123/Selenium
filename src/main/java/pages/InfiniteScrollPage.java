package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class InfiniteScrollPage {
    private  WebDriver driver;
    private By para = By.className("jscroll-added");
    public InfiniteScrollPage(WebDriver d){
        this.driver = d;
    }

    public void scrollToParagraph(int paragraphNumber){
        String script = "window.scrollTo(0, document.body.scrollHeight)";
        var jsExecutor = (JavascriptExecutor)driver;
        while(numberOfParagraphOnPage() < paragraphNumber){
            jsExecutor.executeScript(script);
        }
    System.out.println(numberOfParagraphOnPage());
    }
    public int numberOfParagraphOnPage(){
        return driver.findElements(para).size();
    }

}
