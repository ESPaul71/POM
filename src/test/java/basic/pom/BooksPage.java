package basic.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BooksPage extends Base {

	By homePageLocator = By.id("userName-value");
	By buttonGoBooks = By.xpath("//button[@id='gotoStore']");
	By newBook = By.linkText("Git Pocket Guide");
	By buttonAdd = By.xpath("(//button[@id='addNewRecordButton'])[2]");
	By bookTable = By.xpath("//div[@class='profile-wrapper']");
	By bookDeleted = By.xpath("(//button[text()='Delete All Books'])[1]");
	By modalButton = By.id("closeSmallModal-ok");
	
	public BooksPage(WebDriver driver) {
		super(driver);
	}
	
	
	public void GoToBookStore() throws InterruptedException {
		WaitForLoad();
		Thread.sleep(2000);
		Scroll(buttonGoBooks);
        click(buttonGoBooks);
	}
	
	public void SelectBook() throws InterruptedException {
		WaitForLoad();
        Thread.sleep(5000);
        click(newBook);
	}
	
	
	public void AddBook() throws InterruptedException{
            
            WaitForLoad();
            Thread.sleep(5000);
            Scroll(buttonAdd);
            Thread.sleep(5000);
            click(buttonAdd);
            Thread.sleep(5000);
            AcceptAlert();
            Thread.sleep(2000);
            visit("https://demoqa.com/profile");
	}
	
	public String getBookDisplayed() {
        if (isDisplayed(newBook)) {
            return getText(newBook);
        } else {
            return "";
        }
    }
	
	public void DeleteBook() throws InterruptedException {
		
        WaitForLoad();
        Thread.sleep(5000);
        Scroll(bookDeleted);
        click(bookDeleted);
        Thread.sleep(5000);
        click(modalButton);
        Thread.sleep(5000);
        AcceptAlert();
        Thread.sleep(5000);
	}
	
	
}
