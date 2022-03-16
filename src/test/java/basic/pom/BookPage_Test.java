package basic.pom;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class BookPage_Test {
	  
	private WebDriver driver;
	BooksPage bookPage;
	@Before

	    public void setUp(){
			bookPage = new BooksPage(driver);
	    }
	    @Test

	    public void test() throws InterruptedException{
	    	bookPage.GoToBookStore();
	        
	        bookPage.SelectBook();
	              
	        bookPage.AddBook();
	        
	        bookPage.getBookDisplayed();
	        
	        bookPage.DeleteBook();
	    }
	    @After

	    public void tearDown() throws InterruptedException{
	        driver.close();
	        driver.quit();
	    }
}
