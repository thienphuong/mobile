package com.linecorp.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class Header {

	public static final Target SEARCH_BOX = 
			Target.the("Search box").located(MobileBy.id("jp.naver.line.android:id/searchbar_input_text"));

}
