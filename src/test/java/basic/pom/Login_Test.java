 package basic.pom;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Login_Test {

	private WebDriver driver;
    LogInPage logInPage;
    BooksPage bookPage;
    
    @Before

    public void setUp() throws Exception {
        logInPage = new LogInPage(driver);
        driver = logInPage.chromeDriverConection();
        driver.manage().window().maximize();
        bookPage = new BooksPage(driver);
        logInPage.visit("https://demoqa.com/login");
    }
    @Test

    public void test() throws InterruptedException{
        logInPage.logIn();
        Thread.sleep(2000);
        assertEquals("paul1", logInPage.getUserNameDisplayed());
        
        bookPage.GoToBookStore();
        
        bookPage.SelectBook();
              
        bookPage.AddBook();
        
        
        assertEquals("Git Pocket Guide", bookPage.getBookDisplayed());
        
        bookPage.DeleteBook();
        
    }
    @After

    public void tearDown() throws InterruptedException{
        driver.close();
        driver.quit();
    }
}
