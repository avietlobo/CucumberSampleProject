package framework;

import org.openqa.selenium.WebDriver;

public class AbstractPage {
	
	private WebDriver driver;

    public AbstractPage(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver getDriver() {
        return driver;
    }


}
