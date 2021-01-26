import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

/*
public class AppUITests {
    public static URL url;
    public static DesiredCapabilities capabilities;
    public static IOSDriver<IOSElement> driver;
    @BeforeSuite
    public void setupAppium() throws MalformedURLException {
        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        url = new URL(URL_STRING);
        capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capabilities.setCapability(MobileCapabilityType.NO_RESET, true);
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.2");
        capabilities
                .setCapability(MobileCapabilityType.APP,
                        "/Users/trichez/Library/Developer/Xcode/DerivedData/NIM-gtuggnmxuvemxlbqqjljcedbhcwj/Build/Products/Debug-iphonesimulator/BFMTV.app");
        driver = new IOSDriver<IOSElement>(url, capabilities);
    }
    @AfterSuite
    public void afterSuite() {
        driver.closeApp();
    }
    @Test
    public void basicTest() throws InterruptedException {
        driver.resetApp();
    }
}*/
