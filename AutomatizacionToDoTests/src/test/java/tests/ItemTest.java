package tests;

import activity.ItemManagerActivity;
import activity.MainActivity;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;

public class ItemTest {
    MainActivity mainActivity= new MainActivity();
    ItemManagerActivity itemManagerActivity = new ItemManagerActivity();

    @Test
    public void verifyAddItem() throws MalformedURLException {
        String newItem = "Compra 1";
        mainActivity.addButton.click();
        itemManagerActivity.titleTextBox.enterText("Compra 1");
        itemManagerActivity.notesTextBox.enterText("3 litros de leche, 10 panes");
        itemManagerActivity.saveButton.click();

        // Validacion
        Assert.assertTrue("ERROR, el item no se pudo agregar",mainActivity.isItemDisplayed(newItem));
    }

    @Test
    public void verifyEditItem() throws MalformedURLException {
        String itemEdited = "Compra 5";

        // Agregar item que se va a editar
        mainActivity.addButton.click();
        itemManagerActivity.titleTextBox.enterText("Compra 1");
        itemManagerActivity.notesTextBox.enterText("1 litros de leche, 1 panes");
        itemManagerActivity.saveButton.click();
        mainActivity.addButton.click();
        itemManagerActivity.titleTextBox.enterText("Compra 2");
        itemManagerActivity.notesTextBox.enterText("2 litros de leche, 2 panes");
        itemManagerActivity.saveButton.click();

        // Editar item agregado
        mainActivity.viewGroupSelect("2").click();
        itemManagerActivity.titleTextBox.enterText("Compra 5");
        itemManagerActivity.notesTextBox.enterText("5 litros de leche, 5 panes");
        itemManagerActivity.saveButton.click();

        // Validacion
        Assert.assertTrue("ERROR, el item no se pudo agregar",mainActivity.isItemDisplayed(itemEdited));
    }



    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
