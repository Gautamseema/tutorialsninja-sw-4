package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCartPage extends Utility {
    /**
     * DesktopsTest
     */
    By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");
    By shoppingCartText = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By getProductName = By.linkText("HP LP3065") ;
    By getDeliveryDateText = By.xpath("//small[contains(text(),'Delivery Date:2023-07-09')]");
    By getProduct21Text = (By.xpath("//td[contains(text(),'Product 21')]"));


    public String getShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }
    public String getProductNameText(){

        return getTextFromElement(getProductName);
    }
    public String getDeliveryDateText(){
        return getTextFromElement(getDeliveryDateText );
    }
    public String getProduct21Text() {
        return getTextFromElement(getProduct21Text);
    }


/**
 * LaptopTest
  */
    By ShoppingCartText1 = (By.xpath("//h1[contains(text(),(0.00kg)')]"));
    By ProductnameMacBook = (By.xpath("//form[@method='post']//a[text()='MacBook']"));
    By QuantityFieldclear = (By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]"));
    By ChangeQyantity = (By.xpath("//tbody/tr[1]/td[4]/div[1]/input[1]"));
    By UpdateTab = (By.xpath("//i[@class='fa fa-refresh']"));
    By SuccessMessage1 = (By.xpath("//body/div[@id='checkout-cart']/div[1]"));
   // By $737.45Text = (By.xpath("//tbody//tr//td[6]"));
    By CheckoutButton = (By.xpath("//a[contains(text(),'Checkout')]"));

    public void verifyShoppingCartText(){
        assertVerifyText(ShoppingCartText1,"Shopping Cart  (0.00kg)","Shopping Cart text is not found");
    }
    public void verifyProductNameMacBookText(){
        assertVerifyText(ProductnameMacBook,"MacBook","MacBook text is not found");
    }
    public void EnterQuantity2(String text){
        driver.findElement(QuantityFieldclear).clear();
        sendTextToElement(ChangeQyantity,text);
    }
    public void clickOnUpdateTab(){
        clickOnElement(UpdateTab);
    }
    public void verifySuccessMessage1(){
        assertVerifyText(SuccessMessage1,"Success: You have modified your shopping " +
                "cart!\n×","Success message is not found");
    }
//    //public void verify$1204Text(){
//        assertVerifyText($737Text,"$1,204.00","Total $1,204.00 is not found");
//    }
    public void clickOnCheckoutButton(){
        clickOnElement(CheckoutButton);
    }

}
