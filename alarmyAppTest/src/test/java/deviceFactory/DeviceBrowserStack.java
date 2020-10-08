package deviceFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class DeviceBrowserStack implements IDevice {

    public static String userName = "susselvillarroel1";
    public static String accessKey = "3Nj23tpHmMexSRBdzuRo";

    @Override
    public AppiumDriver create() throws MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("device", "Google Pixel 3");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("project", "UCB Diplopmado");
        caps.setCapability("build", "V0.1");
        caps.setCapability("name", "ToDo");
        caps.setCapability("app", "bs://5e5c8a2ed501e2cfdfd24cba8cdc7d4e37cecb36");

        AppiumDriver driver = new AndroidDriver<AndroidElement>(new URL("https://"+userName+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub"), caps);
        return driver;

    }
}
