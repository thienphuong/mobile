package com.linecorp.questions;

import net.serenitybdd.screenplay.Question;

public class WebView {
	
	public static Question<String> titleOfPage() {
		return new TitleOfPage();
	}
	
	public static Question<String> currentUrlOfPage() {
		return new CurrentUrlOfPage();
	}

}
