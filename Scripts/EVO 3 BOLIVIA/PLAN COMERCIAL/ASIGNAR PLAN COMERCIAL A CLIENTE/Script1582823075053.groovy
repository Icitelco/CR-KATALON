import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('EVO 3 BOLIVIA/LOGIN EVO 3'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

//SE VA A LA PANTALLA DE CLIENTE
WebUI.navigateToUrl('https://192.168.1.115/SIGA-BO/servlet/wwcliente')

//SE CREA EL CLIENTE PARA APLICAR EL PLAN COMERCIAL
WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Clientes_INSERT'))

WebUI.delay(10)

//NOMBRE DEL CLIENTE 
WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Nombre_W0029W0007W0009CLIENTENOM'), 'PRUEBAA PLAN COMERCIAL')

//APELLIDO DEL CLIENTE
WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Apellido_W0029W0007W0009CLIENTEAPE'), 'PRUEBA')

WebUI.clearText(findTestObject('Object Repository/Page_Cliente/input_Fecha de Nacimiento_W0029W0007W0009CL_add09b'))

//FECHA DE NACIMIENTO DEL CLIENTE
WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Fecha de Nacimiento_W0029W0007W0009CL_add09b'), '20/08/2000')

//SEXO DEL CLIENTE
WebUI.selectOptionByValue(findTestObject('Object Repository/BOLIVIA/select_(Ninguno)MASCULINOFEMENINO_1'), 'M', true)

//SEGMENTO DE NEGOCIO DEL CLIENTE
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_DTH PREPAGOHFC HOMEDTH POSPAGOCORPOR_ce81ba'), 
    '2', true)

//TIPO DE CLIENTE
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_CLIENTE STAFFCLIENTES DTH PRECORPORA_44c2a3'), 
    '2', true)

//NACIONALIDAD
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Ninguno)ABJASIAAFGHANISTANALBANIAAL_5ee262'), 
    '75', true)

//RUT DE CLIENTE
WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_NIT_W0029W0007W0009CLIENTERUT'), '4263692|460919')

WebUI.click(findTestObject('Object Repository/Page_Cliente/select_GUAYARAMERINMAGDALENARIBERALTARURREN_67b0ce'))

//DEPARTAMENTO CLIENTE
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_GUAYARAMERINMAGDALENARIBERALTARURREN_67b0ce'), 
    '48', true)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Cliente/select_(Todos)GUAYARAMERIN'))

//CIUDAD CLIENTE
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Todos)GUAYARAMERIN'), '1', true)

//CLIENTE DIRECCION
WebUI.setText(findTestObject('Object Repository/Page_Cliente/textarea_Direccin_W0029W0007W0009CLICALDIRECCION'), 'PRUEBA1414')

//SUCURSAL CLIENTE
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Todos)DTHDTH  BENI'), '13', true)

//ZONA CLIENTE
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_(Todos)CASARABEGUAYARAMERINHUACARAJE_4d171c'), 
    '40720', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cliente/select_CONT ADMINISTRATIVOCONT REP LEGALCON_91ab9f'), 
    'C', true)

//CLIENTE TELEFONO
WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Bonificacion_W0029W0007W0009CLIENTETEL_0001'), '84563256')

WebUI.setText(findTestObject('Object Repository/Page_Cliente/input_Bonificacion_W0029W0007W0009CLIENTETE_eac1de'), 'PRUEBA TEL')

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_Nueva fila_W0029W0007W0009ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_Antiguedad de Deuda_W0029W0007W0009ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_URN_W0029W0007INSERT'))

//CLIENTE CEDULA
WebUI.setText(findTestObject('Object Repository/Page_Cliente Documento/input_Nmero de Documento_W0024W0007W0009CLIENTECI'), 
    '4263692')

WebUI.click(findTestObject('Object Repository/Page_Cliente Documento/input_Emisor_W0024W0007W0009ENTER'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Contratos'))

WebUI.click(findTestObject('Object Repository/Page_Cliente/input_URN_W0029W0007CONTRATOAGREGAR'))

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_Linea Convergente_PLANCOMERCIAL'))

//NOMBRE DEL PLAN COMERCIAL
WebUI.setText(findTestObject('Page_Ingreso de Contratos/input_Nombre_vE_FILTROPLANCOMERCIALNOMBRE'), '%PLAN COMERCIAL KATA%')

WebUI.click(findTestObject('Page_Ingreso de Contratos/input_Nombre_BUSCAR'))

WebUI.click(findTestObject('BOLIVIA/a_PLAN COMERCIAL SEL'))

WebUI.click(findTestObject('Page_Ingreso de Contratos/input_PLAN PRUEBA_SELECCIONAR'))

WebUI.click(findTestObject('Page_Ingreso de Contratos/input_Promotor_vE_PROMPTPROMOTOR'))

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/a_ROBERTO CARLOS SUAREZ ALVAREZ'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Ingreso de Contratos/select_(Ninguno)BAGO-CONSULTORIO MEDICO RUS_8e8da7'), 
    '124', true)

WebUI.click(findTestObject('Object Repository/Page_Ingreso de Contratos/input_NO VALIDADO_CONFIRMAR'))

WebUI.click(findTestObject('Page_Ingreso de Contratos/button_Aceptar'))

