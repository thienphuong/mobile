/**
 * 
 */
package serenitybdd.appiumtest.features;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;

/**
 * @author vuthelinh@gmail.com
 */
public class Hook {
	@Managed(driver = "Appium")
	public WebDriver hisMobileDevice;

	String jacob = "Jacob";
	
	@Before
	public void annaCanBrowseTheMobileApp(){
		OnStage.setTheStage(new OnlineCast());
	}
	
/*    static AppiumDriverLocalService appiumService = null;

    @BeforeClass
    public static void startAppiumServer() throws IOException {
        appiumService = AppiumDriverLocalService.buildDefaultService();
        appiumService.start();
    }

    @AfterClass
    public static void stopAppiumServer() {
        appiumService.stop();
    }*/
}