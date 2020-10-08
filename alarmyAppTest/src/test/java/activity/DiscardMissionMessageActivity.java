package activity;

import appiumControl.Button;
import org.openqa.selenium.By;

public class DiscardMissionMessageActivity {

    public Button discardButton;

    public DiscardMissionMessageActivity(){
        discardButton= new Button(By.id("droom.sleepIfUCan:id/buttonDiscard"));
    }
}
