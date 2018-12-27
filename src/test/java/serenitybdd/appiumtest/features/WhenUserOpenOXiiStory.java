package serenitybdd.appiumtest.features;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import static org.hamcrest.Matchers.equalTo;

import org.junit.Test;
import org.junit.runner.RunWith;

import com.linecorp.interactions.GetContextView;
import com.linecorp.model.UserAccount;
import com.linecorp.questions.WebView;
import com.linecorp.tasks.Chat;
import com.linecorp.tasks.Login;
import com.linecorp.tasks.Open;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

@RunWith(SerenityRunner.class)
public class WhenUserOpenOXiiStory extends Hook {

	@Test
	public void open_oxii_on_web_view() {

		final String friend = "LINE";
		final String application = "https://www.webtretho.com";

		UserAccount account = new UserAccount.UserAccountBuilder().withEmail("ngothienphuong@gmail.com")
				.withPassword("LineVN2019").usingOTP("1234").build();

		theActorCalled(jacob).can(BrowseTheWeb.with(hisMobileDevice));

		theActorInTheSpotlight().attemptsTo(
				Login.credentials(account), 
				Chat.with(friend).about(application),
				Open.a(application));

		theActorInTheSpotlight().should(
				seeThat(WebView.titleOfPage(), equalTo("Diễn đàn Webtretho")),
				seeThat(WebView.currentUrlOfPage(), equalTo("https://www.webtretho.com/forum/login")));
	}

}