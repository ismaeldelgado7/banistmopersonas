package co.com.project.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.waits.WaitUntil;

public class AnswerPDF implements Question<String> {
    private final String Title;

    public AnswerPDF(String Title) {
        this.Title = Title;
    }

    public static AnswerPDF is(String Title) {
        return new AnswerPDF(Title);
    }

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(WaitUntil.angularRequestsHaveFinished());
        return BrowseTheWeb.as(actor).getTitle();

    }
}
