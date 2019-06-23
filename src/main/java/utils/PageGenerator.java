package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.automationpractice.Testing.TestAutomation.pages.BasePage;

public class PageGenerator {


    //JAVA Generics to Create and return a New Page
    public static  <TPage extends BasePage> TPage getInstance (Class<TPage> pageClass , WebDriver driver ) throws Exception {
        try {
            //Initialize the Page with its elements and return it.
            return PageFactory.initElements(driver,  pageClass);
        } catch (Exception e) {
            e.printStackTrace();
            throw e;
        }
    }
}
