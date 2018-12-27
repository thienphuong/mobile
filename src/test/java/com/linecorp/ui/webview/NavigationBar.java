package com.linecorp.ui.webview;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class NavigationBar {
	
	public static final Target LOGIN_REGISTER = 
			Target.the("login icon").located(By.xpath("//div[@id='guest-menu']/a"));


}
