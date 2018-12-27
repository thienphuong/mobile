package com.linecorp.ui;

/**
 * @author jacob.vu@linecorp.com
 *
 */

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class Registration {

	public static final Target LOG_IN = Target.the("Log in button")
			.located(By.id("jp.naver.line.android:id/registration_btn_login_account"));
	
	public static final Target SIGN_UP = Target.the("Log in button")
			.located(By.id("jp.naver.line.android:id/registration_btn_create_account"));
	
}
