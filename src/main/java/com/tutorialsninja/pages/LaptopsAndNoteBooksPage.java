package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNoteBooksPage extends Utility {
    By LaptopAndNoteBookText = By.linkText("Laptops & Notebooks");
    By selectPriceHighToLow = By.xpath("//select[@id='input-sort']");
    By arrangeHighToLowOrder = By.xpath("//p[@class= 'price']");
    By productMacBook = By.linkText("MacBook");
    By MacBookText = By.linkText("MacBook");
    By addToCartButton = By.xpath("//button[@id='button-cart']");
    By successMessage = By.xpath("//div[@class='alert alert-success alert-dismissible']");
    By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");

    public void verifyLaptopAndNoteBookText(){
    assertVerifyText(LaptopAndNoteBookText,"Laptops & Notebooks","Text is not found");
    }
    public void verifyArrangeHighToLowOrder(){
       verifyList(arrangeHighToLowOrder);
    }

    private void verifyList(By arrangeHighToLowOrder) {
    }

    public void selectPriceHighToLow(String text){
        selectByVisibleTextFromDropDown(selectPriceHighToLow, text );
    }
    public void clickOnProductName(){
        clickOnElement(productMacBook);
    }
    public void verifyMacBookText(){
    assertVerifyText(MacBookText,"MacBook","text is not found" );
    }
    public void clickOnCartButton(){
        clickOnElement(addToCartButton);
    }
    public void verifySuccessMessage(){
    assertVerifyText(successMessage,"Success: You have added MacBook to your " +
                           "shopping cart!\n×","text is not found");
    }
    public void clickOnShoppingCard(){
        clickOnElement(shoppingCartLink);
    }
}
