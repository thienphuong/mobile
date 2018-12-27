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

public class GetContextView extends AndroidObject implements Interaction {
	
	static String context = "";
	
	public GetContextView(Actor actor) {
		this.context = getAndroidDriver(actor).getContext();
	}
	
	@Override
	@Step("{0} wants to know context view: #context")
	public <T extends Actor> void performAs(T actor) {
	
	}
	
	public static Interaction show(Actor actor) {
		return instrumented(GetContextView.class, actor);
	}
	
	public static String getContext() {
		return context;
	}

}
