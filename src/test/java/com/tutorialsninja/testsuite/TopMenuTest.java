package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest  {
    HomePage homePage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    LaptopsAndNoteBooksPage laptopsAndNoteBooksPage = new LaptopsAndNoteBooksPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully(){
        homePage.mouseHoverOnDesktopsTab();
        homePage.SelectShowAllTheDesktops();
        desktopsPage.verifyDesktopsText();
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully(){
        // Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.mouseHoverOnLaptopNotebooksTab();
        //  Mouse hover on “Laptops & Notebooks” Tab and click
        homePage.SelectShowAllLaptopsNotebooks();
        //Verify the text ‘Laptops & Notebooks’
        laptopsAndNoteBooksPage.verifyLaptopAndNoteBookText() ;
    }
    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully(){
       //Mouse hover on “Components” Tab and click
       homePage.MouseHoverOnComponentsTab();
      //call selectMenu method and pass the menu = “Show All Components”
      homePage.SelectShowAllComponents() ;
      //Verify the text ‘Components’
        homePage.verifyComponentsText();
    }
}
