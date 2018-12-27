package com.linecorp.ui;

import io.appium.java_client.MobileBy;
import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginPage extends Element{

	public static final Target EMAIL_FIELD = 
			Target.the("email field").located(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"jp.naver.line.android:id/text\").text(\"Email address\")"));
	
    public static final Target PASSWORD_FIELD = Target.the("Password").located(
            MobileBy.AndroidUIAutomator("new UiSelector().className(\"android.widget.EditText\").text(\"Password\")"));
	
	public static final Target CONFIRM_BUTTON = 
			Target.the("confirm button").located(MobileBy.id("jp.naver.line.android:id/registration_btn_confirm_identifier"));
	
	public static final Target DIALOG_CONTENT = 
			Target.the("dialog content text").located(By.id("jp.naver.line.android:id/common_dialog_content_text"));
	
	public static final Target DIALOG_OK_BUTTON = 
			Target.the("Ok button of dialog").located(By.id("jp.naver.line.android:id/common_dialog_ok_btn"));
	
	public static final Target DIALOG_CANCEL_BUTTON = 
			Target.the("Cancel button of dialog").located(By.id("jp.naver.line.android:id/common_dialog_cancel_btn"));
	
	public static final Target PHONE_NUMBER = 
			Target.the("phone number field").located(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"jp.naver.line.android:id/text\").text(\"Phone number\")"));
	
	public static final Target NEXT_BUTTON = 
			Target.the("next button").located(By.id("jp.naver.line.android:id/registration_btn_send_pin"));
	
	public static final Target PIN_CODE = 
			Target.the("next button").located(By.id("jp.naver.line.android:id/registration_pin_code"));
	
	public static final Target OK_NEXT = 
			Target.the("next button").located(By.id("jp.naver.line.android:id/registration_btn_ok"));
	
	public static final Target COMPLETE_BUTTON = 
			Target.the("next button").located(By.id("jp.naver.line.android:id/registration_btn_confirm"));

}
