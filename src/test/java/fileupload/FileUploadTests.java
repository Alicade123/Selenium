package fileupload;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FileUploadTests  extends BaseTests {

    @Test
    public void enterText(){
        var fileUploadPage = homePage.clickFileUploadPage();
        fileUploadPage.clickFileUpload("C:\\Users\\USER\\IdeaProjects\\TestAutomation\\resources\\ABITURIJEDUSABEAlicadeAmpersand.pdf");
        var fileUploadStatus = fileUploadPage.clickFileUploadButton();
        String txt = fileUploadStatus.getStatus();
        assertTrue(txt.contains("ABITURIJEDUSABEAlicadeAmpersand.pdf"), "Something went wrong");
    }
}
