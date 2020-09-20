package deviceFactory;

import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public interface IDevice {
    // Crear conexion a distintos dispositivos
    AppiumDriver create() throws MalformedURLException;
}
