package co.com.project.test.stepdefinitions;


import co.com.project.questions.AnswerPDF;
import co.com.project.task.Clickear;
import co.com.project.task.HacerClick;
import co.com.project.task.OpenUp;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import cucumber.api.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RetoTecnicoStepDefinitions {


    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario");
    }

    @Dado("^ingreso a la pagina de banistmo$")
    public void ingreso_a_la_pagina_de_banistmo() {
        theActorInTheSpotlight().attemptsTo(OpenUp.ThePage());
    }


    @Cuando("^hago click en tarifario$")
    public void hago_click_en_tarifario() {
        theActorInTheSpotlight().attemptsTo(HacerClick.EnElBotonTarifario());
    }

    @Y("^hago click en el PDF Tarifa Cuentas De Depositos$")
    public void hago_click_en_el_PDF_Tarifa_Cuentas_De_Depositos() {
        theActorInTheSpotlight().attemptsTo(Clickear.EnElBotonTarifaCuentaDeDepositos());
    }

    @Entonces("^deberia abrirse correctamente el archivo con el titulo \"([^\"]*)\"$")
    public void deberia_abrirse_correctamente_el_archivo_con_el_titulo(String Title) {
        theActorInTheSpotlight().should(seeThat(AnswerPDF.is(Title)));
    }

}
