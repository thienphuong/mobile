package com.linecorp.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.targets.Target;

public class BoxChat {

	public static final Target BOX_CHAT = Target.the("Friend").located(
            MobileBy.id("jp.naver.line.android:id/chathistory_message_edit")
    );

	public static final Target SEND_BUTTON = Target.the("send button").located(
            MobileBy.id("jp.naver.line.android:id/chathistory_send_button_image")
    );

	public static final String LINK_TEXT_SELECTOR = "new UiSelector().resourceId(\"jp.naver.line.android:id/message_text\").text(\"{0}\")";
}