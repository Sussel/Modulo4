package activity;

import appiumControl.Button;
import appiumControl.Label;
import appiumControl.ViewGroup;
import org.openqa.selenium.By;

public class MainActivity {
    public Button addButton;
    public ViewGroup viewGroupSelect;

    public MainActivity(){
        addButton= new Button(By.id("com.vrproductiveapps.whendo:id/fab"));
        viewGroupSelect = new ViewGroup(By.xpath("//android.widget.ListView/android.view.ViewGroup[1]"));
    }

    public ViewGroup viewGroupSelect(String index){
        String locator = "//android.widget.ListView/android.view.ViewGroup["+index+"]";
        ViewGroup viewGroupItem = new ViewGroup(By.xpath(locator));
        return viewGroupItem;
    }

    public boolean isItemDisplayed(String newItem){
        String locator="//android.widget.TextView[@text='"+ newItem + "']";
        Label item = new Label(By.xpath(locator));
        return item.isDisplayed();
    }

}
