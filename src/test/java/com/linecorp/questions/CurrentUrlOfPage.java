package com.linecorp.questions;

import com.linecorp.driver.AndroidObject;
import com.linecorp.ui.webview.NavigationBar;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

/**
 * @author  vuthelinh@gmail.com
 * 
 * WEBVIEW_package and NATIVE_APP
 *
 */

public class CurrentUrlOfPage extends AndroidObject implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		actor.attemptsTo(
				Click.on(NavigationBar.LOGIN_REGISTER));
		return getAndroidDriver(actor).getCurrentUrl();
	}
}
