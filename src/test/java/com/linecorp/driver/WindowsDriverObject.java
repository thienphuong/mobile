package com.linecorp.driver;


import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.webdriver.WebDriverFacade;

public class WindowsDriverObject{

	public void click(Actor actor) {
		WinDriver(actor).findElementByAccessibilityId("AddAlarmButton").click();
	}
	
	@SuppressWarnings("unchecked")
	private WindowsDriver<WindowsElement> WinDriver(Actor actor) {
		return (WindowsDriver<WindowsElement>) ((WebDriverFacade) getDriver(actor)).getProxiedDriver();

	}
	
	private static WebDriverFacade getDriver(Actor actor) {
		return ((WebDriverFacade) BrowseTheWeb.as(actor).getDriver());
	}
	

}
