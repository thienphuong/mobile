package com.linecorp.questions;

import com.linecorp.driver.AndroidObject;
import com.linecorp.interactions.GetContextView;
import com.linecorp.interactions.SwitchToWebView;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

/**
 * @author  vuthelinh@gmail.com
 * 
 *
 */

public class TitleOfPage extends AndroidObject implements Question<String> {

	@Override
	public String answeredBy(Actor actor) {
		actor.attemptsTo(
				SwitchToWebView.to("WEBVIEW_jp.naver.line.android")
			);
		return getAndroidDriver(actor).getTitle();
	}
	
/*	public static Question<String> disappear() {
        return new TitleOfPage();
    }*/
}
