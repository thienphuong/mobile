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

public class SwitchToWebView extends AndroidObject implements Interaction {
	
	private String web_view;
	
	public SwitchToWebView(String web_view) {
		this.web_view = web_view;
	}

	@Override
	@Step("{0} swith to wweb view mode")
	public <T extends Actor> void performAs(T actor) {
		switchToWebView(actor, web_view);
	}

	public static Interaction to(String web_view) {
		return instrumented(SwitchToWebView.class, web_view);
	}

}
