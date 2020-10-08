package activity;

import appiumControl.Button;
import org.openqa.selenium.By;

public class WelcomeActivity {

    public Button getStartedButton;

    public WelcomeActivity(){
        getStartedButton= new Button(By.id("droom.sleepIfUCan:id/button_ok"));
    }
}
