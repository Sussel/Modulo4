package activity;

import appiumControl.Button;
import org.openqa.selenium.By;

public class MainMissionActivity {
    public Button backButton;

    public MainMissionActivity(){
        backButton= new Button(By.xpath("//android.view.ViewGroup/android.view.ViewGroup/android.widget.ImageView[1]"));
    }
}
