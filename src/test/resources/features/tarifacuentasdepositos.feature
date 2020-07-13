# language: es
# encoding: UTF8
@tarifa_cuentas_depositos
Característica: Búsqueda de Tarifa Cuentas de Depositos
  Yo como Cliente de Banistmo
  Quiero entrar la pagina de banistmo
  Para ver la tarifa de cuenta de depositos

  @tag1
  Escenario: Abrir PDF Tarifa Cuentas de Depositos
    Dado ingreso a la pagina de banistmo
    Cuando hago click en tarifario
    Y hago click en el PDF Tarifa Cuentas De Depositos
    Entonces deberia abrirse correctamente el archivo con el titulo "TarifarioDepositos"



