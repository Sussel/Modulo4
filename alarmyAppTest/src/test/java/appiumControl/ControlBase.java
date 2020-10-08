package appiumControl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import sessionManager.Session;

import java.net.MalformedURLException;

public class ControlBase {

    protected WebElement control;
    protected By locator;

    public ControlBase(By locator){
        this.locator = locator;
    }

    public void findControl() throws MalformedURLException {
        this.control = Session.getInstance().getDriver().findElement(this.locator);
    }

    public void click() throws MalformedURLException {
        this.findControl();
        this.control.click();
    }

    public String getText() throws MalformedURLException {
        this.findControl();
        return this.control.getText();
    }

    public boolean isDisplayed(){
        try {
            this.findControl();
            return this.control.isDisplayed();
        }catch(Exception ex){
            return false;
        }
    }

    public String getDeviceTime () throws MalformedURLException {
        return Session.getInstance().getDriver().getDeviceTime();
    }
}
