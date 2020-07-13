package co.com.project.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ButtonTarifario extends PageObject {
    public static Target BUTTON_TARIFARIO = Target.the("BOTON OPCION TARIFARIO")
            .located(By.xpath("//a[contains(text(), 'Tarifario')]"));
}
