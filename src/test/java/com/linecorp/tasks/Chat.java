package com.linecorp.tasks;

import static com.linecorp.ui.Header.SEARCH_BOX;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

import com.linecorp.ui.Tabs;
import com.linecorp.ui.BoxChat;
import com.linecorp.ui.Dashboard;
import com.linecorp.ui.Profile;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;

public class Chat implements Task {

	private String friend = "";
	private String text = "";

	public Chat(String name, String text) {
		this.friend = name;
		this.text = text;
	}

	public static ChatBuider with(String friend) {
		return new ChatBuider(friend);
	}

	public static Task about(String text) {
		return instrumented(Chat.class, text);
	}

	public static class ChatBuider {
		private String name;

		public ChatBuider(String name) {
			this.name = name;
		}

		public Task about(String text) {
			return instrumented(Chat.class, name, text);
		}
	}
	
	@Override
	@Step("{0} chats with #friend about #text")
	public <T extends Actor> void performAs(T actor) {
				actor.attemptsTo(
						//WaitUntil.the(Dashboard.SEARCH_FRIEND, isCurrentlyVisible()).forNoMoreThan(60).seconds(),
						Click.on(Dashboard.SEARCH_FRIEND), Enter.theValue(friend).into(SEARCH_BOX),
						Click.on(Tabs.of("Friends")),
						Click.on(Tabs.of(friend)),
						Click.on(Profile.CHAT_ICON),
						Enter.theValue(text).into(BoxChat.BOX_CHAT),
						Click.on(BoxChat.SEND_BUTTON));

	}

}
