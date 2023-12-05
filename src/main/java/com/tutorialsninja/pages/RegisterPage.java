package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By RegisterText = By.xpath("//h1[contains(text(),'Register Account')]");
    By FirstNameField = By.xpath("//input[@id='input-firstname']");
    By LastNameField = By.xpath("//input[@id='input-lastname']");
    By EmailField = By.xpath("//input[@id='input-email']");
    By TelephoneField = By.xpath("//input[@id='input-telephone']");
    By PasswordField = By.xpath("//input[@id='input-password']");
    By PasswordConfirmField = (By.xpath("//input[@id='input-confirm']"));
    By YesRadioButton = By.xpath("//label[normalize-space()='Yes']");
    By policyCheckBox = By.xpath("//input[@name='agree']");
    By ContinueButton = By.xpath("//input[@value ='Continue']");
    By ContinueButton1 = By.xpath("//a[contains(text(),'Continue')]");
    By CreatedMessage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");

    public void verifyRegisterText(String expectedText, String Text) {
        assertVerifyText(RegisterText, expectedText, Text);
    }
    public void EnterFirstName(String text){
        sendTextToElement(FirstNameField,text);
    }
    public void EnterLastName(String text){
        sendTextToElement(LastNameField,text);
    }
    public void EnterEmail(String text){
        sendTextToElement( EmailField,text);
    }
    public void EnterTelephoneNo(String text){
        sendTextToElement(TelephoneField,text);
    }
    public void EnterPassword(String text){
        sendTextToElement(PasswordField,text);
    }
    public void EnterPasswordConfirm(String text){
        sendTextToElement(PasswordConfirmField,text);
    }
    public void ClickOnYesRadioButton(){
        clickOnElement(YesRadioButton );
    }
    public void ClickOnPolicyCheckBox(){
        clickOnElement(policyCheckBox);
    }
    public void ClickOnContinueButton(){
        clickOnElement(ContinueButton);
    }
    public void verifySuccessMessage(String expectedText,String Text){
        assertVerifyText(CreatedMessage,expectedText,Text);
    }
    public void ClickOnContinueButton1(){
        clickOnElement(ContinueButton1);
    }

}