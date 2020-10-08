package activity;

import appiumControl.Button;
import org.openqa.selenium.By;

public class WelcomeStepOneActivity {

    public Button skipButton;

    public WelcomeStepOneActivity(){
        skipButton= new Button(By.id("droom.sleepIfUCan:id/button_skip"));
    }
}
