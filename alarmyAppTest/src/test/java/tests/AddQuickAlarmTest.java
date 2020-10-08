package tests;

import activity.*;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import sessionManager.Session;

import java.net.MalformedURLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AddQuickAlarmTest {

    MainActivity mainActivity = new MainActivity();
    WelcomeActivity welcomeActivity = new WelcomeActivity();
    WelcomeStepOneActivity welcomeStepOneActivity = new WelcomeStepOneActivity();
    MissionActivity missionActivity = new MissionActivity();
    SelectMissionActivity selectMissionActivity = new SelectMissionActivity();
    MainMissionActivity mainMissionActivity = new MainMissionActivity();
    DiscardMissionMessageActivity discardMissionMessageActivity = new DiscardMissionMessageActivity();
    QuickAlarmActivity quickAlarmActivity = new QuickAlarmActivity();

    @Test
    public void verifyAddAlarm() throws MalformedURLException, ParseException {

        // alarm app extra steps
        if(welcomeActivity.getStartedButton.isDisplayed()) {
            welcomeActivity.getStartedButton.click();
            welcomeStepOneActivity.skipButton.click();
        }

        if(missionActivity.fordwarButton.isDisplayed()) {
            missionActivity.fordwarButton.click();
            selectMissionActivity.backButton.click();
            mainMissionActivity.backButton.click();
            discardMissionMessageActivity.discardButton.click();
        }

        // Add an alarm
        mainActivity.addButton.click();
        mainActivity.quickAlarmButton.click();
        quickAlarmActivity.sixtyMinutesButton.click();
        quickAlarmActivity.fifteenMinutesButton.click();

        String deviceTime = quickAlarmActivity.deviceFunctions.getDeviceTime();
        SimpleDateFormat isoFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        Date deviceDate = isoFormat.parse(deviceTime);
        deviceDate = DateUtils.addMinutes(deviceDate, 75);
        System.out.println(new SimpleDateFormat("hh:mm").format(deviceDate));

        quickAlarmActivity.okButton.click();

        // Verification
        Assert.assertTrue("ERROR, la alarma no se pudo adicionar",mainActivity.isItemDisplayed(String.valueOf(new SimpleDateFormat("hh:mm").format(deviceDate))));
    }

    @After
    public void after() throws MalformedURLException {
        Session.getInstance().closeSession();
    }
}
