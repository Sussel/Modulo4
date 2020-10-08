package activity;

import appiumControl.Button;
import org.openqa.selenium.By;

public class SelectMissionActivity {
    public Button backButton;

    public SelectMissionActivity(){
        backButton= new Button(By.xpath("//android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView"));
    }
}
