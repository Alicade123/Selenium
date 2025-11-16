package fileupload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class FileUploadTests  extends BaseTests {

    @Test
    public void enterText(){
        var fileUploadPage = homePage.clickFileUploadPage();
        fileUploadPage.clickFileUpload("C:\\Users\\USER\\IdeaProjects\\TestAutomation\\resources\\ABITURIJEDUSABEAlicadeAmpersand.pdf");
        var fileUploadStatus = fileUploadPage.clickFileUploadButton();
        String txt = fileUploadStatus.getStatus();
        assertEquals(txt, "C:\\Users\\USER\\IdeaProjects\\TestAutomation\\resources\\ABITURIJEDUSABEAlicadeAmpersand.pdf", "Something went wrong");
    }
}
