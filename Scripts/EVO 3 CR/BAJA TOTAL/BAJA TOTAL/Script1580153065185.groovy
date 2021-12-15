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

CLIENTENRO = '2518'

WebUI.callTestCase(findTestCase('EVO 3 CR/LOGIN EVO 3 CR/LOGIN'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wwcliente')

WebUI.delay(5)

WebUI.setText(findTestObject('Object Repository/Page_Clientes/input_Cliente Nro_vCLIENTENRO'), CLIENTENRO)

WebUI.click(findTestObject('Object Repository/Page_Clientes/input_Home Pack_SEARCHBUTTON'))

WebUI.click(findTestObject('Object Repository/Page_Clientes/img_Cantidad facturas_vDISPLAY_0001'))

GENERAL = WebUI.getUrl()

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Contratos'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Servicios'))

WebUI.click(findTestObject('Object Repository/Page_ANA BORDALLO ABAD/input_Histricos_W0033W0007AGREGARSERVICIO'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Page_Ingreso de Servicio de Clientee/select_NingunoINSTALACION DE AMPLIFICADOR 1_84c31f'), 
    '1', true)

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Page_Ingreso de Servicio de Clientee/select_FALTA DE PAGO CORPORATIVOMIGRACION A_411bf6'), 
    '349', true)

WebUI.click(findTestObject('Page_Ingreso de Servicio de Clientee/input_Codigo Postal_AGREGAR'))

WebUI.delay(10)

WebUI.navigateToUrl('http://10.7.148.132:8080/SIGA-TG/servlet/wope0300')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/select_(Ninguno)INSTALACIONDESCONEXIONSERVI_985ee4'), 
    'D', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/select_(Ninguno)PENDIENTEAGENDADAREAGENDARS_d46bd3'), 
    'P', true)

WebUI.setText(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/input_Cliente Nro_vE_CLIENTENROORD_F'), 
    CLIENTENRO)

WebUI.click(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/input_Cliente Nro_BUTTON1'))

WebUI.click(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/input_Orden Confirmada_vE_EMITIR_0001'))

WebUI.delay(3)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Emitir Ordenes Pendientes de Cliente/select_(Ninguno)ADRIAN VEGA ASTORGAALEJANDR_457c3e'), 
    '16805', true)

WebUI.click(findTestObject('Object Repository/Page_Emitir Ordenes Pendientes de Cliente/input_Tecnico_allbox'))

WebUI.click(findTestObject('Object Repository/Page_Emitir Ordenes Pendientes de Cliente/input_Page_EMITIRORDEN'))

WebUI.click(findTestObject('Object Repository/Page_Emitir Ordenes Pendientes de Cliente/button_Aceptar'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Emitir Ordenes Pendientes de Cliente/input_Page_VOLVER'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/select_(Ninguno)PENDIENTEAGENDADAREAGENDARS_d46bd3'), 
    'E', true)

WebUI.setText(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/input_Cliente Nro_vE_CLIENTENROORD_F'), 
    CLIENTENRO)

WebUI.click(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/input_Cliente Nro_BUTTON1'))

WebUI.click(findTestObject('Object Repository/Page_Pantalla de Ordenes de Servicio/img_Orden Confirmada_vE_CUMPLIR_0001'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Cumplir una Orden/select_PENDIENTESUSPENDIDAFINALIZADAREAGENDAR'), 
    'F', true)

A = WebUI.getText(findTestObject('Object Repository/Page_Cumplir una Orden/span_24012020'))

WebUI.setText(findTestObject('Object Repository/Page_Cumplir una Orden/input_Comienzo_W0027ORDENFCOM'), A)

WebUI.setText(findTestObject('Object Repository/Page_Cumplir una Orden/input_Finalizada_W0027ORDENFFIN'), A)

WebUI.click(findTestObject('Object Repository/Page_Cumplir una Orden/input_Observacin_W0027ENTER'))

WebUI.navigateToUrl(GENERAL)

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Servicios'))

WebUI.delay(6)

WebUI.click(findTestObject('Object Repository/Page_Cliente/span_Contratos'))

