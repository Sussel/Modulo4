package activity;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;

public class MainActivity {
    public Button addButton;
    public Button quickAlarmButton;

    public MainActivity(){
        addButton = new Button(By.xpath("//android.widget.ImageButton"));
        quickAlarmButton = new Button(By.id("droom.sleepIfUCan:id/alarmListFabQuick"));
    }

    public boolean isItemDisplayed(String newItem){
        String locator="//android.widget.TextView[1][@text='"+ newItem + "']";
        Label item = new Label(By.xpath(locator));
        return item.isDisplayed();
    }


}
