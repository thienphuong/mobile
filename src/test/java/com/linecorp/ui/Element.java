package com.linecorp.ui;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Element {
	

	public static final Target theButtonHasLabel(String label) {
		return Target.the("button").located(By.xpath(String.format("//android.widget.Button[contains(@text,'%s')]", label)));
	}
	
	public static final Target theInputFieldHasTextValue(String label) {
		return Target.the("edit text").located(By.xpath(String.format("//android.widget.EditText[contains(@text,'%s')]", label)));
	}
		
}
