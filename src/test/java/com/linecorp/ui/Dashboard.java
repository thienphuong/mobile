package com.linecorp.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class Dashboard {
	
	public static final Target ADD_FRIENDS = 
			Target.the("add friends button").located(MobileBy.AndroidUIAutomator("new UiSelector().description(\"Add friends button\")"));

	public static final Target SEARCH_FRIEND = 
			Target.the("search friends button").located(MobileBy.AndroidUIAutomator("new UiSelector().description(\"Search button\")"));
	
	public static final Target SETTINGS = 
			Target.the("settings button").located(MobileBy.AndroidUIAutomator("new UiSelector().description(\"Settings button\")"));
	
}
