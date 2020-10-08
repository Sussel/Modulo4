package activity;

import appiumControl.Button;
import org.openqa.selenium.By;

public class MissionActivity {
    public Button fordwarButton;

    public MissionActivity(){
        fordwarButton= new Button(By.id("droom.sleepIfUCan:id/mission"));
    }

}
