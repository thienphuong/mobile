package com.linecorp.ui;

import java.text.MessageFormat;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class MenuBar {
	
	public static final Target theItemHasLabel(String label) {
		return Target.the("button").located(
				MobileBy.AndroidUIAutomator(
						MessageFormat.format("new UiSelector().className(\"android.view.View\").text(\"{0}\")", label)));
	}
}
