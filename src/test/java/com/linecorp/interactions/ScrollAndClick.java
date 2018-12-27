package com.linecorp.interactions;

/**
 * @author vuthelinh@gmail.com
 *
 */

import static net.serenitybdd.screenplay.Tasks.instrumented;

import com.linecorp.driver.AndroidObject;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.thucydides.core.annotations.Step;

public class ScrollAndClick extends AndroidObject implements Interaction {

	private String labelText = "";

	public ScrollAndClick(String labelText) {
		this.labelText = labelText;
	}

	@Override
	@Step("{0} Swipe to element by visible text: #labelText ")
	public <T extends Actor> void performAs(T actor) {
		SwipeToElement(actor, labelText);
	}

	public static Interaction on(String labelText) {
		return instrumented(ScrollAndClick.class, labelText);
	}

}
