package com.linecorp.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class Profile {

	public static final Target CHAT_ICON = 
			Target.the("Chat button on profile account").located(MobileBy.id("jp.naver.line.android:id/frienddetaildialog_button_icon"));

}
