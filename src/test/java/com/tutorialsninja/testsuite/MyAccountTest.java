package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LogInPage;
import com.tutorialsninja.pages.RegisterPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class MyAccountTest extends BaseTest  {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LogInPage logInPage = new LogInPage();

    @Test
    public void verifyUserShouldNavigateToRegisterPageSuccessfully(){
    //Click on My Account Link.
     homePage.clickOnMyAccountLink();
     //Select “Register”
     homePage.selectRegister();
     //Verify the text “Register Account”.
     registerPage.verifyRegisterText("Register Account","text is not found");
    }
    @Test
    public void verifyThatUserRegisterAccountSuccessfully(){
    //Click on My Account Link.
      homePage.clickOnMyAccountLink();
    //Select “Register”
     homePage.selectRegister();
    // Enter First Name
     registerPage.EnterFirstName("Alex");
    //Enter Last Name
     registerPage.EnterLastName("Bond");
    //Enter Email
     registerPage.EnterLastName("AlexBond@gmail.com");
    //Enter Telephone
    registerPage.EnterTelephoneNo("078666655567");
    //Enter Password
    registerPage.EnterPassword("AlexB4567");
    //Enter Password Confirm
     registerPage.EnterPasswordConfirm("AlexB4567");
    //Select Subscribe Yes radio button
    registerPage.ClickOnContinueButton();
    //Select Subscribe Yes radio button
    registerPage.ClickOnYesRadioButton();
    // Click on Privacy Policy check box
    registerPage.ClickOnPolicyCheckBox();
    //Click on Continue button
      registerPage.ClickOnContinueButton();
    //Verify the message “Your Account Has Been Created!”
      registerPage.verifySuccessMessage("Your Account Has Been Created!","text not match");
    //ClickOnContinueButton
      registerPage.ClickOnContinueButton1();
    //Click On My Account Link
        logInPage.clickOnMyAccountLink();
    // Select “Logout”
        logInPage.selectLogOut();
    // Verify the text “Account Logout”
        logInPage.verifyAccountLogOutText("Account Logout","text not match") ;
    //Click on Continue button
        logInPage.ClickOnContinueButton();
    }
}
