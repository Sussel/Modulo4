package activity;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class ItemManagerActivity {
    public TextBox titleTextBox;
    public TextBox notesTextBox;
    public Button saveButton;

    public ItemManagerActivity(){
        titleTextBox= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextTitle"));
        notesTextBox= new TextBox(By.id("com.vrproductiveapps.whendo:id/noteTextNotes"));
        saveButton = new Button(By.id("com.vrproductiveapps.whendo:id/saveItem"));
    }
}

