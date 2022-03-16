package basic.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage extends Base {
	  By userLocator = By.id("userName");
	  By passLocator = By.id("password");
	  By singInBtnLocator = By.id("login");
	  By homePageLocator = By.id("userName-value");

	    public LogInPage(WebDriver driver) {
	        super(driver);
	    }

	    public void logIn() throws InterruptedException {
	        if (isDisplayed(userLocator)) {
	            type("paul1", userLocator);
	            type("Paul123#", passLocator);
	            Thread.sleep(2000);
	            click(singInBtnLocator);
	            Thread.sleep(2000);
	        } else {
	            System.out.println("username textbox was not present");
	        }
	    }

	    public String getUserNameDisplayed() {
	        if (isDisplayed(homePageLocator)) {
	            return getText(homePageLocator);
	        } else {
	            return "";
	        }
	    }
}
