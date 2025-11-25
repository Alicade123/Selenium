package login;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.SecureArea;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class LoginTests extends BaseTests {

@Test
public void testSuccessfulLogin(){
     LoginPage loginPage = homePage.ClickAuthenticationLink();
     loginPage.setUserName("tomsmith");
     loginPage.setPassword("SuperSecretPassword!");
     SecureArea secureArea = loginPage.clickLoginButton();

     String actualResult = secureArea.getAlert();
     //assertEquals(actualResult,"You logged into a secure area!","Your logged in successfully");
     assertTrue(secureArea.getAlert().contains("Ohh!!! You logged into a secure area!"),"Login Successful!");
}

}
