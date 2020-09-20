package deviceFactory;

public class FactoryDevices {
    public static IDevice make(String type){
        IDevice device;

        switch (type){
            case "android":
                device = new DeviceAndroid();
                break;
            case "ios":
                device = new DeviceIOS();
                break;
            case "browserStack":
                device = new DeviceBrowserStack();
                break;
            default:
                device= new DeviceAndroid();
                break;
        }

        return device;
    }
}
