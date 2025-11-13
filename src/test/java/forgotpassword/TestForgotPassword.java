package forgotpassword;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ForgotPassword;

import static org.testng.Assert.assertTrue;

public class TestForgotPassword extends BaseTests{
 @Test
    public void testForgotPassword(){
     ForgotPassword forgotPassword = homePage.clickForgotPassword();
     forgotPassword.setEmail("abiturije1@gmail.com");
     String actualResult =forgotPassword.clickRetrieveButton();
     assertTrue(actualResult.contains("Internal Server Error"),"There is no Internal Server Error");
 }
}
