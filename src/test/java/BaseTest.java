import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public abstract class BaseTest {

    private static AppiumDriverLocalService service;

    @BeforeSuite
    public void globalSetup () throws IOException {
/*        service = AppiumDriverLocalService.buildDefaultService();
        service.start();*/
    }

    @AfterSuite
    public void globalTearDown () {
/*        if (service != null) {
            service.stop();
        }*/
    }

    public URL getServiceUrl () throws MalformedURLException {
        final String URL_STRING = "http://127.0.0.1:4723/wd/hub";
        return new URL(URL_STRING);
/*
        return service.getUrl();
*/
    }

}
