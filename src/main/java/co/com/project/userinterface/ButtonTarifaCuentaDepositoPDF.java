package co.com.project.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ButtonTarifaCuentaDepositoPDF extends PageObject {
    public static Target TARIFA_CUENTA_DEPOSITO_BUTTON = Target.the("BOTON PARA ABRIR EL PDF")
            .located(By.xpath("//a[@href='/wps/wcm/connect/aae1f540-6e90-4974-a27b-b8867a5fd2c9/S56_ActualizacionTarifarioDepositos_Dic2019+%281%29+%282%29.pdf?MOD=AJPERES&CVID=n8g171g']"));
}
