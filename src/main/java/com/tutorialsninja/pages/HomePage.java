package com.tutorialsninja.pages;

import com.tutorialsninja.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility  {
    By DesktopsTab = (By.linkText("Desktops"));
    By SelectShowAllTheDesktops = (By.linkText("Show AllDesktops"));
    By LaptopNotebookTab = (By.linkText("Laptops & Notebooks"));
    By selectShowAllLaptopsNotebooks = (By.linkText("Show AllLaptops & Notebooks"));
    By ComponentsText = (By.xpath("//h2[contains(text(),'Components')]"));
    By SelectShowAllComponents = (By.linkText("Show AllComponents"));
    By MyAccountLink = (By.xpath("//span[contains(text(),'My Account')]"));
    By selectLogin = (By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Login']"));
    By selectRegister = (By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']"));

    public void mouseHoverOnDesktopsTab(){
        mouseHoverToElement(DesktopsTab );
    }
    public void SelectShowAllTheDesktops(){
        mouseHoverToElementAndClick(SelectShowAllTheDesktops);
    }
    public void mouseHoverOnLaptopNotebooksTab(){
        mouseHoverToElement(LaptopNotebookTab);
    }
    public void SelectShowAllLaptopsNotebooks() {
        mouseHoverToElement(selectShowAllLaptopsNotebooks);
    }
    public void MouseHoverOnComponentsTab (){
        mouseHoverToElement(ComponentsText);
    }
    public void SelectShowAllComponents(){
        mouseHoverToElementAndClick(SelectShowAllComponents);
    }
    public void verifyComponentsText(){
    assertVerifyText(ComponentsText,"Components","Components text is not found");
    }
    public void clickOnMyAccountLink(){
        clickOnElement(MyAccountLink );
    }
    public void selectLogin(){
        mouseHoverToElementAndClick(selectLogin);
    }
    public void selectRegister(){
        mouseHoverToElementAndClick(selectRegister);
    }
}
