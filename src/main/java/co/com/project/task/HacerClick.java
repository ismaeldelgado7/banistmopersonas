package co.com.project.task;

import co.com.project.userinterface.ButtonTarifario;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;

public class HacerClick implements Task {
    public static HacerClick EnElBotonTarifario(){
        return Tasks.instrumented(HacerClick.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(ButtonTarifario.BUTTON_TARIFARIO, isClickable()).forNoMoreThan(10).seconds(),
                Click.on(ButtonTarifario.BUTTON_TARIFARIO));

    }
}
