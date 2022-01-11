#language: es

@Historia
Característica: Ingresar al aplicativo de Davivienda y ver mis productos
  Yo como usuario Quiero ingresar a la app Davivienda Para ver mis productos

  @CasoDePrueba1
  Escenario: Ingresar a la app Davivienda exitosamente
    Dado que Christopher ingresa a la app Davivienda
    Cuando digita sus credenciales
    Entonces Verifica que sus productos aparezcan

  @CasoDePrueba2
  Escenario: Ingreso a la app Davivienda Fallido
    Dado que Christopher ingresa a la app davivienda cliente
    Cuando digita las credenciales de logueo
    Entonces Verifica que no puede acceder a los productos