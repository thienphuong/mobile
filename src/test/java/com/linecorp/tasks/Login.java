package com.linecorp.tasks;

import static com.linecorp.ui.Element.theButtonHasLabel;
import static com.linecorp.ui.LoginPage.COMPLETE_BUTTON;
import static com.linecorp.ui.LoginPage.CONFIRM_BUTTON;
import static com.linecorp.ui.LoginPage.DIALOG_OK_BUTTON;
import static com.linecorp.ui.LoginPage.EMAIL_FIELD;
import static com.linecorp.ui.LoginPage.NEXT_BUTTON;
import static com.linecorp.ui.LoginPage.OK_NEXT;
import static com.linecorp.ui.LoginPage.PASSWORD_FIELD;
import static com.linecorp.ui.LoginPage.PHONE_NUMBER;
import static com.linecorp.ui.LoginPage.PIN_CODE;
import static com.linecorp.ui.Registration.LOG_IN;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyEnabled;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

import com.linecorp.driver.AndroidObject;
import com.linecorp.interactions.ScrollAndClick;
import com.linecorp.model.UserAccount;
import com.linecorp.ui.Dashboard;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class Login extends AndroidObject implements Task{
	
	private UserAccount account;
	
	public Login(UserAccount account) {
		this.account = account;
	}

	@Override
	@Step("{0} log in with credentials is #account ")
	public <T extends Actor> void performAs(T actor) {
		actor.attemptsTo(
				Click.on(LOG_IN),
				WaitUntil.the(EMAIL_FIELD, isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
				Enter.theValue(account.getEmail()).into(EMAIL_FIELD),
				Enter.theValue(account.getPassword()).into(PASSWORD_FIELD),
				Click.on(CONFIRM_BUTTON),
				Click.on(DIALOG_OK_BUTTON),
				
				WaitUntil.the(theButtonHasLabel("Continue"), isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
				Click.on(theButtonHasLabel("Continue")),
				Click.on(theButtonHasLabel("ALLOW")),
				/*
				 * Issue: Can't interact with any element after click on ALLOW
				 * Solution: Use appium.automationName=uiautomator2
				 * 
				 * */
				WaitUntil.the(PHONE_NUMBER, isCurrentlyEnabled()).forNoMoreThan(30).seconds(),
				Enter.theValue("0925954341").into(PHONE_NUMBER),
				Click.on(NEXT_BUTTON),
				/*
				 * 1234 is PIN on Bata version
				 * */
				Enter.theValue("1234").into(PIN_CODE),
				Click.on(OK_NEXT)				
				/*
				 * * For the first time regiester
				 * ScrollAndClick.on("OK"),
				 * Click.on(COMPLETE_BUTTON)
				 */
				);
		
	}

	public static Task credentials(UserAccount account) {
		return instrumented(Login.class, account );
	}
	
	

}
