package com.linecorp.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Tabs {
	
	
	public static final Target of(String name) {
		return Target.the("tab").located(By.xpath(String.format("//android.widget.TextView[@text='%s']", name)));
	}

}
