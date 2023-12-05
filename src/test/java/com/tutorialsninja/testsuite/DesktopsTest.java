package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.ShoppingCartPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DesktopsTest extends BaseTest  {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    ShoppingCartPage shoppingCartPage = new ShoppingCartPage();

    @Test
    public void verifyProductArrangeInAlphaBaticalOrder(){
   // Mouse hover on Desktops Tab.and click
    homePage.mouseHoverOnDesktopsTab();
   //Click on “Show All Desktops”
   homePage.SelectShowAllTheDesktops();
   //Select Sort By position "Name: Z to A"
   desktopsPage.selectNameZtoA("Name(Z -A)");
   //Verify the Product will arrange in Descending order
   desktopsPage.ListDescendingOrder();
    }
    @Test
    public void verifyProductAddedToShoppingCartSuccessFully(){
    // Mouse hover on Desktops Tab. and click
    homePage.mouseHoverOnDesktopsTab();
    //Click on “Show All Desktops”
    homePage.SelectShowAllTheDesktops();
    //Select Sort By position "Name: A to Z"
    desktopsPage.SelectNameAtoZ("Name (A - Z)");
    //Select product “HP LP3065”
    desktopsPage.clickOnHPLP3065Link();
    //Verify the Text "HP LP3065"
    String expectedText = "HP LP3065";
    String actualText = desktopsPage.getHPLP3065text();
    Assert.assertEquals(actualText,expectedText,"HP LP3065 text is not found");
    //Select Delivery Date "2023-07-09"
    desktopsPage.selectDeliveryDate("2023-11-27");
    //Enter Qty "1” using Select class.
    desktopsPage.quantityChange("1");
    //Click on “Add to Cart” button
    desktopsPage.clickOnAddCartButton();
    //Verify the Message “Success: You have added HP LP3065 to your shopping cart!”
     String expectedText1 = "Success: You have added HP LP3065 to your shopping cart!\n×";
     String actualText1 = desktopsPage.getMessageDisplay() ;
     Assert.assertEquals(actualText1,expectedText1,"Sucess message  is not found");
    //Click on link “shopping cart” display into success message
    desktopsPage.clickOnShopping();
    //Verify the text "Shopping Cart"
    String expectedText2 = "Shopping Cart  (1.00kg)";
    String actualText2 = shoppingCartPage.getShoppingCartText();
    Assert.assertEquals(actualText2,expectedText2,"Shopping Cart text is not found");
    }
}
