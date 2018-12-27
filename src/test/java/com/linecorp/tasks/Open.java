package com.linecorp.tasks;

import static com.linecorp.ui.BoxChat.LINK_TEXT_SELECTOR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.text.MessageFormat;

import com.linecorp.interactions.GetContextView;

import io.appium.java_client.MobileBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.Step;

public class Open implements Task {
	
    private final String message;

    public Open(String message) {
        this.message = message;
    }

    @Override
    @Step("{0} visits #message")
    public <T extends Actor> void performAs(T actor) {
    	
        Target link = Target.the("Link").located(MobileBy.AndroidUIAutomator(MessageFormat.format(LINK_TEXT_SELECTOR, message)));
        
        actor.attemptsTo(
                Click.on(link)
        );
    }

    public static Open a(String link) {
        return instrumented(Open.class, link);
    }
}