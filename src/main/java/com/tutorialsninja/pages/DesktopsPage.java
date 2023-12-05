package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopsPage extends Utility  {
 By DesktopsText = By.xpath("//h2[contains(text(),'Desktops')]");
 By selectNameZtoA = By.xpath("//select[@id='input-sort']");
 By ListDescendingOrder = By.xpath("//div[@class='caption']");
 By selectNameAtoZ = By.xpath("//select[@id='input-sort']");
 By HPLP3065Link = By.xpath("//a[contains(text(),'HP LP3065')]");
 By HPLP3065Text = By.xpath("//h1[contains(text(),'HP LP3065')]");
 By DeliveryDateFieldClear = By.xpath("//input[@id='input-option225']");
 By quantityFieldClear = (By.xpath("//input[@id='input-quantity']"));
 By AddToCartButton = By.xpath("//button[@id='button-cart']");
 By getMessage = (By.xpath("//div[text() ='Success: You have added ']"));
 By shoppingCartLink = (By.cssSelector("div[class='alert alert-success alert-dismissible'] a:nth-child(2)"));
 private By EnterDeliveryDate;

 public void verifyDesktopsText(){
  assertVerifyText(DesktopsText,"Desktops","Desktops text is not found");
 }

//


 public void SelectNameZtoA(String text) {
  selectByVisibleTextFromDropDown(selectNameZtoA,text);
 }

 public void ListDescendingOrder(){
  List<WebElement> ProductName = (List<WebElement>) driver.findElement(ListDescendingOrder);
  System.out.println(ProductName.size());
  for(WebElement product : ProductName){
   System.out.println(product.getText());
  }
 }
 public void SelectNameAtoZ(String text1){

  selectByVisibleTextFromDropDown(selectNameAtoZ,text1);
 }
 public void clickOnHPLP3065Link(){
  clickOnElement(HPLP3065Link);
 }
 public String  getHPLP3065text(){
  return getTextFromElement(HPLP3065Text);
 }
 public void selectDeliveryDate(String text){
  driver.findElement(DeliveryDateFieldClear).clear();
  sendTextToElement(EnterDeliveryDate,text);
 }
 public void quantityChange(String text){
  driver.findElement(quantityFieldClear).clear();
  sendTextToElement(String text );
 }
 public void clickOnAddCartButton(){
  clickOnElement(AddToCartButton );
 }
 public String getMessageDisplay(){
  return getTextFromElement(getMessage );
 }
 public void clickOnShopping(){
  clickOnElement(shoppingCartLink );
 }

 public void selectNameZtoA(String s) {
 }
}
