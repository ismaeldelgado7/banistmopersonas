package co.com.project.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class Clickear implements Task {
    public static Clickear EnElBotonTarifaCuentaDeDepositos(){
        return Tasks.instrumented(Clickear.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

    }
}
