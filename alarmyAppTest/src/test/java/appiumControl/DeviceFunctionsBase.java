package appiumControl;

import sessionManager.Session;
import java.net.MalformedURLException;

public class DeviceFunctionsBase {

    public DeviceFunctionsBase(){
    }


    public String getDeviceTime () throws MalformedURLException {
        return Session.getInstance().getDriver().getDeviceTime();
    }
}
