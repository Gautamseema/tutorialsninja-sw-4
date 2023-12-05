package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.CheckOutPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class LaptopAndNotebooksTest extends BaseTest {
    HomePage homePage = new HomePage();
    LaptopsAndNoteBooksPage laptopsAndNoteBooksPage = new LaptopsAndNoteBooksPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();
    CheckOutPage checkoutPage = new CheckOutPage();

    @Test
    public void verifyProductsPriceDisplayHighToLowSuccessfully() {
        //Mouse hover on Laptops & Notebooks Tab.and click
        homePage.mouseHoverOnLaptopNotebooksTab();
        //Click on “Show All Laptops & Notebooks”
        homePage.SelectShowAllLaptopsNotebooks();
        //Select Sort By "Price (High > Low)"
        laptopsAndNoteBooksPage.selectPriceHighToLow("Price(High>Low)");
        //Verify the Product price will arrange in High to Low order.
        laptopsAndNoteBooksPage.verifyArrangeHighToLowOrder();
    }

    @Test
    public void verifyThatUserPlaceOrderSuccessfully() {
        //Mouse hover on Laptops & Notebooks Tab and click
        homePage.mouseHoverOnLaptopNotebooksTab();
        //Click on “Show All Laptops & Notebooks”
        homePage.SelectShowAllLaptopsNotebooks();
        //Select Sort By "Price (High > Low)"
        laptopsAndNoteBooksPage.selectPriceHighToLow("Price(High>Low)");
        //Select Product “MacBook”
        laptopsAndNoteBooksPage.clickOnProductName();
        // Verify the text “MacBook”
        laptopsAndNoteBooksPage.verifyMacBookText();
        // Click on ‘Add To Cart’ button
        laptopsAndNoteBooksPage.clickOnCartButton();
        // Verify the message “Success: You have added MacBook to your shopping cart!”
        laptopsAndNoteBooksPage.verifySuccessMessage();
        // Click on link “shopping cart” display into success message
        laptopsAndNoteBooksPage.clickOnShoppingCard();
        //Verify the text "Shopping Cart"
        shoppingCartPage.verifyShoppingCartText();
        //Verify the Product name "MacBook"
        shoppingCartPage.verifyProductNameMacBookText();
        //Change Quantity "2"
        shoppingCartPage.EnterQuantity2("2");
        // Click on “Update”Tab
        shoppingCartPage.clickOnUpdateTab();
        // Verify the message “Success: You have modified your shopping cart!”
        shoppingCartPage.verifySuccessMessage1();
        //Verify the Total $737.45
        // shoppingCartPage.verify$737.45Text();
        //Click on “Checkout” button
        shoppingCartPage.clickOnCheckoutButton();
        //Verify the text “Checkout”
        checkoutPage.verifyCheckOutText();
        //Verify the Text “New Customer”
        checkoutPage.verifyNewCustomerText();
        //Click on “Guest Checkout” radio button
        checkoutPage.clickOnGuestRadioButton();
        checkoutPage.clickOnContinueButton();
        //checkoutPage.clickOnContinueButton();
        checkoutPage.EnterFirstNameField("Maya") ;
        checkoutPage.EnterLastNameField("Max") ;
        checkoutPage.EnterEmail("MayaMax@gmail.com");
        checkoutPage.EnterTelephone("0866904391");
        checkoutPage.EnterAddress("10 Haines Way");
        checkoutPage.EnterCity("Watford");
        checkoutPage.EnterPostcode("WD25 7DF");
        checkoutPage.selectCountry("United Kingdom");
        checkoutPage.selectState("HERTFORDSHIER");
       //Click on “Continue” Button
       checkoutPage.clickOnContinueButton1() ;
       //Add Comments About your order into text area
        checkoutPage.AddCommentBoxField("I want early delivery ");
      //Check the Terms & Conditions check box
        checkoutPage.ClickOnConditionCheckBox();
     //Click on “Continue” button
        checkoutPage.ClickOnContinueButton2();
    }
}