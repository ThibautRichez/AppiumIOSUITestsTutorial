import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static java.util.Collections.emptyList;

public class IOSCreateSessionTest extends BaseTest {
    private IOSDriver<MobileElement> driver;

    @BeforeSuite
    public void setUp() throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "XCUITest");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 11");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "14.2");
        capabilities.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.nextradiotv.bfmtv");
/*        capabilities.setCapability(MobileCapabilityType.APP,
                "/Users/trichez/Library/Developer/Xcode/DerivedData/NIM-gtuggnmxuvemxlbqqjljcedbhcwj/Build/Products/Debug-iphonesimulator/BFMTV.app");*/

        driver = new IOSDriver<MobileElement>(getServiceUrl(), capabilities);
        /*driver.resetApp();*/
    }

    @AfterSuite
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testCreateSession () {
        // Check that the XCUIElementTypeApplication was what we expect it to be
        IOSElement applicationElement = (IOSElement) driver.findElementByClassName("XCUIElementTypeApplication");
        String applicationName = applicationElement.getAttribute("name");
        Assert.assertEquals(applicationName, "BFMTV");
    }

/*    @Test
    public void testAcceptCMP () {
        IOSElement cmpPopup = (IOSElement) new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("consent_popup_view")));
        IOSElement validateButton = (IOSElement) cmpPopup.findElementByName("Accepter & Fermer");
        validateButton.click();

        IOSElement closeInterstitialButton = (IOSElement) new WebDriverWait(driver, 10)
                .until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AccessibilityId("Close Advertisement")));
        closeInterstitialButton.click();
    }*/
}
