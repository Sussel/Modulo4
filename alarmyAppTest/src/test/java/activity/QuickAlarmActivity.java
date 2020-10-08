package activity;

import appiumControl.Button;
import appiumControl.DeviceTime;
import org.openqa.selenium.By;

public class QuickAlarmActivity {

    public Button fifteenMinutesButton;
    public Button sixtyMinutesButton;
    public Button okButton;
    public DeviceTime deviceFunctions;

    public QuickAlarmActivity(){
        fifteenMinutesButton = new Button(By.id("droom.sleepIfUCan:id/btn15minutes"));
        sixtyMinutesButton = new Button(By.id("droom.sleepIfUCan:id/btn60minutes"));
        okButton= new Button(By.id("droom.sleepIfUCan:id/btnOk"));
        deviceFunctions = new DeviceTime();
    }
}
